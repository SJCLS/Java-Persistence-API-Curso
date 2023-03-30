package com.example.exemplojpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.exemplojpa.model.Curso;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CursoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Curso inserir(Curso curso){
        return entityManager.merge(curso);
    }
    @Transactional
    public void deletar(Long id) {
        Curso curso = entityManager.find(Curso.class, id);
        entityManager.remove(curso);
    }
}



<h1>Java Persistence API Curso</h1>

<p>Este projeto é um exemplo de aplicação Java que utiliza o framework Spring Boot e a tecnologia Java Persistence API (JPA) para implementar um simples CRUD (Create, Read, Update, Delete) para um modelo de dados de cursos.</p>

<h2>Pré-requisitos</h2>

<ul>
	<li>Java 8 ou superior</li>
	<li>Maven 3 ou superior</li>
	<li>Algum editor de código, como o Eclipse ou o IntelliJ IDEA</li>
</ul>

<h2>Instalação</h2>

<p>Para instalar e executar este projeto, siga as instruções abaixo:</p>

<ol>
	<li>Clone este repositório em sua máquina local</li>
	<li>Abra um terminal na pasta raiz do projeto</li>
	<li>Execute o comando <code>mvn clean install</code> para compilar o projeto e gerar o pacote executável</li>
	<li>Execute o comando <code>java -jar target/exemplojpa-0.0.1-SNAPSHOT.jar</code> para iniciar a aplicação</li>
	<li>Abra um navegador web e acesse a URL <code>http://localhost:8080/cursos</code> para visualizar a lista de cursos</li>
</ol>

<h2>Tecnologias utilizadas</h2>

<ul>
	<li>Spring Boot - framework para criar aplicações web em Java</li>
	<li>Java Persistence API (JPA) - tecnologia para mapeamento objeto-relacional em Java</li>
	<li>Maven - ferramenta para gerenciamento de dependências e compilação de projetos Java</li>
	<li>H2 Database - banco de dados em memória utilizado para armazenar os dados da aplicação</li>
	<li>Thymeleaf - motor de template utilizado para renderizar as páginas web da aplicação</li>
</ul>

<h2>Funcionalidades</h2>

<ul>
	<li>Listagem de cursos - página que exibe uma tabela com os cursos cadastrados no sistema</li>
	<li>Cadastro de curso - página que permite ao usuário cadastrar um novo curso no sistema</li>
	<li>Atualização de curso - página que permite ao usuário atualizar um curso existente no sistema</li>
	<li>Exclusão de curso - página que permite ao usuário excluir um curso existente no sistema</li>
</ul>

<h2>Autor</h2>

<p>Este projeto foi criado por [seu nome aqui].</p>

<h2>Licença</h2>

<p>Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.</p>

