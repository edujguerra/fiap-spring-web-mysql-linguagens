package br.com.fiap.edujguerra.domain.linguagem;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_LINGUAGEM")
public class Linguagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Linguagem(DadosCadastroLinguagem dados) {
        this.nome = dados.nome();
    }

    public Linguagem(){}

    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void atualizaDados(DadosAlteracaoLinguagem dados) {
        this.nome = dados.nome();
    }
}
