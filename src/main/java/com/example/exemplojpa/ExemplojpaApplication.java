package com.example.exemplojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.exemplojpa.model.Curso;
import com.example.exemplojpa.repository.CursoRepository;

@SpringBootApplication
public class ExemplojpaApplication {

@Bean
public CommandLineRunner init(@Autowired CursoRepository cursoRepository) {
return args ->{
	Curso c1 =new Curso((long)0, "Análise e Desenvolvimento de Sistema",250);
	Curso c2 =new Curso((long)0, "Jogos Digitais",200);
	Curso c3 =new Curso((long)0, "Gestão de T.I.",200);
	Curso c4 =new Curso((long)0, "Eng. Computação",500);
	cursoRepository.inserir(c1);
	cursoRepository.inserir(c2);
	cursoRepository.inserir(c3);
	cursoRepository.inserir(c4);
};
}




	public static void main(String[] args) {
		SpringApplication.run(ExemplojpaApplication.class, args);
	}

}

