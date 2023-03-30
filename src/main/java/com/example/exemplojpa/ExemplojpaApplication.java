package com.example.exemplojpa;

import java.util.List;

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
	System.out.println("**** INSERINDO CURSO ****");
	Curso c1 =new Curso((long)1, "Análise e Desenvolvimento de Sistema",250);
	Curso c2 =new Curso((long)2, "Jogos Digitais",200);
	Curso c3 =new Curso((long)3, "Gestão de T.I.",200);
	Curso c4 =new Curso((long)4, "Eng. Computação",500);
	cursoRepository.inserir(c1);
	cursoRepository.inserir(c2);
	cursoRepository.inserir(c3);
	cursoRepository.inserir(c4);

	System.out.println("**** EDITANDO CURSO ****");
	c1 = cursoRepository.obterPorId(1);
	c1.setNome("Análise e Desenvolvimento de SistemaS");
	cursoRepository.editar(c1);

	System.out.println("**** LISTAR TODOS CURSOS ****");
	List<Curso> cursos = cursoRepository.obterTodos();
	for (Curso c : cursos ){
		System.out.println(c.getNome());
	}
	System.out.println("**** OBTER POR NOME ****");
	cursos = cursoRepository.obterPorNome("Análise%");
	for (Curso c : cursos ){
		System.out.println(c.getNome());
	}

	System.out.println("**** EXCLUIR CURSO ****");
	cursoRepository.excluir(2);

	System.out.println("**** MOSTRAR TODOS CURSOS ****");
	cursos = cursoRepository.obterTodos();
	for (Curso c : cursos ){
		System.out.println(c.getNome());
	}


};
}




	public static void main(String[] args) {
		SpringApplication.run(ExemplojpaApplication.class, args);
	}

}

