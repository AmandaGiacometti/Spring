package com.generation.tarefablogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.tarefablogpessoal.model.Postagem;

//@Repository indica que a Interface é do tipo repositório, ou seja, ela é responsável pela interação com o 
//Banco de dados através dos Métodos padrão (Herdados da Interface JPA Repository) e das Query Methods, 
//que são Métodos personalizados que geram consultas (Instruções SQL do tipo Select), através da combinação de 
//palavras chave, que representam os comandos da linguagem SQL.
@Repository

//Essa vai ser a segunda "classe" que eu vou criar!!
//Irá nos auxiliar na interação com o Banco de dados. Contém diversos Métodos pré-implementados para a manipulação 
//dos dados de uma entidade, como Métodos para salvar, deletar, listar e recuperar dados dos objetos persistidos, 
//além de criar consultas personalizadas chamadas Query Methods
//Para utilizar todos os Métodos da Interface Repository, vamos criar dentro da Interface PostagemRepository 
//uma Herança (Extends) com a Interface JpaRepository
public interface PostagemRepository extends JpaRepository<Postagem,Long>{
	/*
	na declaração da Interface foi adicionada a Herança através da palavra reservada extends com a Interface 
	JpaRepository, que recebe 2 parâmetros: 1. a Classe Postagem, que é a Entidade que será mapeada em nosso Banco de 
	dados (Lembre-se que a Classe Postagem foi quem gerou a nossa tabela tb_postagens)
	2.O Long representa a nossa Chave Primária (Primary Key), que é o Atributo que recebeu a anotação @Id na nossa 
	Classe Postagem (o Atributo também se chama id em nossa Classe Postagem). Estes 2 parâmetros são do tipo Java 
	Generics (podem receber qualquer tipo de Objeto <T, T>). Dentro contexto do JPA são o mínimo necessário para 
	executar os Métodos padrão da Interface Repository, que serão implementados na próxima etapa na Classe 
	PostagemController. Estes Métodos básicos já ficam automaticamente disponíveis no Recurso Postagem a partir 
	do momento que a Interface PostagemRepository herda a Interface JpaRepository.
	*/

}

/*
O que é uma Interface?
Em Java é uma Classe Abstrata (uma Classe que serve de modelo para outras Classes), composta somente por 
Métodos abstratos. E como tal, obviamente não pode ser instanciada, ou seja, ela só contém as declarações dos 
Métodos e constantes, nenhuma implementação, apenas as assinaturas dos Métodos, que serão implementados em uma Classe.
*/