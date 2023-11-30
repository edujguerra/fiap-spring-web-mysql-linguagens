package br.com.fiap.edujguerra;

import br.com.fiap.edujguerra.domain.linguagem.LinguagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinguagensApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinguagensApplication.class, args);
	}

}
