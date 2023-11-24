package br.com.fiap.edujguerra.controller;

import br.com.fiap.edujguerra.domain.linguagem.DadosAlteracaoLinguagem;
import br.com.fiap.edujguerra.domain.linguagem.DadosCadastroLinguagem;
import br.com.fiap.edujguerra.domain.linguagem.Linguagem;
import br.com.fiap.edujguerra.domain.linguagem.LinguagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/linguagens")
public class LinguagemController {

    @Autowired
    private LinguagemRepository repository;

    @GetMapping("/formulario")
    public String carregaPaginaFormulario(Long id, Model model) {
        if (id != null) {
            var linguagem = repository.getReferenceById(id);
            model.addAttribute("linguagem", linguagem);
        }
        return "linguagens/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "linguagens/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraLinguagem(DadosCadastroLinguagem dados) {
        var linguagem = new Linguagem(dados);

        repository.save(linguagem);

        return "redirect:/linguagens";
    }

    @PutMapping
    @Transactional
    public String alteraLinguagem(DadosAlteracaoLinguagem dados) {
        var linguagem = repository.getReferenceById(dados.id());
        linguagem.atualizaDados(dados);

        return "redirect:/linguagens";
    }

    @DeleteMapping
    @Transactional
    public String removeLinguagem(Long id) {
        repository.deleteById(id);

        return "redirect:/linguagens";
    }

}
