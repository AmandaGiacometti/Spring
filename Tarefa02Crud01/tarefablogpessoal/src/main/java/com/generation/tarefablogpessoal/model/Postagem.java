package com.generation.tarefablogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

//@Entity indica que esta Classe define uma entidade, será utilizada para gerar uma tabela no Banco de dados da aplicação.
@Entity

//@Table indica o nome da Tabela no Banco de dados. Caso esta anotação não seja declarada, o Banco de dados criará a 
//tabela com o mesmo nome da Classe Model (Postagem). O nome da Tabela é recomendado que seja o mesmo da Classe Model 
//(postagem), em letras minúsculas, sem espaços em branco ou caracteres especiais e acentos.
@Table(name="tb_postagens1")

/*
Primeiro construir a Classe Postagem, que servirá de modelo para construir a tabela tb_postagens (Entidade) 
dentro do nosso Banco de dados db_tarefablogpessoal. Na próxima etapa vamos construir a Interface PostagemRepository, 
que irá nos auxiliar na interação com o Banco de dados. Os Métodos descritos no Diagrama de Classes serão 
implementados na etapa seguinte, na Classe PostagemController.
Depois de criar a Classe Model Postagem, vamos executar o projeto Blog Pessoal no STS. 
Após a execução veremos que será criado no MySQL o Banco de dados db_blogpessoal e a tabela tb_postagens.
*/
public class Postagem {
	
	//acima de cada Atributo foram adicionadas algumas Anotações. Estas anotações tem a função de configurar os 
	//parâmetros do Banco de dados e criar validações para os dados que serão inseridos no objeto (tamanho, formato etc)
	
	//@Id inidica que o Atributo anotado será a Chave Primária (Primary Key) da Tabela tb_postagens1.
	@Id
	//@GeneratedValue indica que a Chave Primária será gerada pelo Spring Data JPA. O parâmetro strategy indica 
	//de que forma esta Chave Primária será gerada. A Estratégia GenerationType.IDENTITY indica que a Chave Primária 
	//será gerada pelo Banco de dados através da opção auto-increment, que gera uma sequência numérica iniciando em 1
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Atributo da Classe Postagem:
	private Long id;
	
	//@NotBlank não permite que o Atributo seja Nulo ou contenha apenas Espaços em branco. 
	//Você pode configurar uma mensagem para o usuário através do Atributo message.
	@NotBlank(message="O título é obrigatório")
	//@Size define o valor min e max de Caracteres do Atributo. Não é obrigatório configurar os 2 parâmetros. 
	//Você pode configurar uma mensagem para o usuário através do Atributo message.
	@Size(min=5,max=100,message="O título deve ter entre 5 e 100 caracteres")
	//Atributo da Classe Postagem:
	private String titulo;
	
	@NotBlank(message="O texto é obigatório")
	@Size(min=10,max=1000,message="O texto deve ter entre 10 e 1000 caracteres")
	//Atributo da Classe Postagem:
	private String texto;
	
	//@UpdateTimestamp configura o Atributo data como Timestamp, ou seja, o Spring se encarregará de obter a 
	//data e inserir no Atributo data toda vez que um Objeto da Classe Postagem for criado ou atualizado.
	@UpdateTimestamp
	//Atributo da Classe Postagem:
	private LocalDateTime data;
	
	//Depois de criarmos os Atributos, precisamos criar os Métodos Get e Set para todos os Atributos da Classe. 
	//O Método Construtor não será necessário porquê o Spring utiliza um recurso chamado Injeção de Dependência 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}
