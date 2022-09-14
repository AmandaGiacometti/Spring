package com.generation.tarefablogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.tarefablogpessoal.model.Postagem;
import com.generation.tarefablogpessoal.repository.PostagemRepository;

//@RestController deﬁne que a Classe é do tipo RestController, que receberá requisições que serão compostas por:
//URL: Endereço da requisição (endpoint)
//Verbo: Define qual Método HTTP será acionado na Classe controladora.
//Corpo da requisição (Request Body): Objeto que contém os dados que serão persistidos no Banco de dadas. 
//Nem toda a requisição enviará dados no Corpo da Requisição.
//Após receber e processar a requisição, a Classe Controladora Responderá a estas requisições com:
//Um Código de Status HTTP pertinente a operação que está sendo realizada.
//O resultado do processamento (Objetos de uma Classe, por ex) inserido diretamente no corpo da resposta (Response Body)
@RestController

//@RequestMapping é usada para mapear as solicitações para os Métodos da Classe controladora PostagemController, 
//ou seja, definir a URL (endereço) padrão do Recurso (/postagens). Ao digitar a url do servidor seguida da url 
//do Recurso (http://localhost:8080/postagens), o Spring envia a requisição para a Classe responsável pelo 
//Recurso associado à este endereço.
@RequestMapping("/postagens")

//@CrossOrigin indica que a Classe controladora permitirá o recebimento de requisições realizadas de fora do domínio 
//(localhost e futuramente do heroku quando o deploy for realizado) ao qual ela pertence. Essa anotação é essencial 
//para que o front-end (Angular ou React), tenha acesso à nossa aplicação (O termo técnico é consumir a API). 
//Além de liberar todas as Origens das requisições (parâmetro origins), a anotação libera também os Cabeçalhos 
//das Requisições (parâmetro allowedHeaders), que em alguns casos trazem informações essenciais para o correto 
//funcionamento da aplicação. Um bom exemplo é o Token de Segurança, que veremos mais à frente, que tem a função 
//de liberar o acesso à um endpoint específico. Em produção recomenda-se substituir o * pelo endereço do deploy do frontend
@CrossOrigin(origins="*",allowedHeaders="*")

//Essa é a terceira classe que eu vou criar!
public class PostagemController {
	
	//@Autowired (Injeção de Dependência), é a implementação utilizada pelo Spring Framework para aplicar a 
	//Inversão de Controle (IoC) quando for necessário. A Injeção de Dependência define quais Classes serão 
	//instanciadas e em quais lugares serão Injetadas quando houver necessidade.
	@Autowired
	private PostagemRepository postagemRepository;
	
	/*
	Em nosso exemplo, a Classe Controladora cria um ponto de injeção da Interface PostagemRepository e quando houver 
	a necessidade o Spring Framework cria um novo Objeto da Classe Postagem a partir da Interface PostagemRepository, 
	permitindo o uso de todos os Métodos da Interface (Métodos Padrão ou Personalizados), sem a necessidade de criar 
	Métodos Construtores na Classe Model ou Criar/Instanciar Objetos de forma manual (igual vocês fizeram no Bloco I). 
	Estamos transferindo a responsabilidade desta tarefa para o Spring e desta forma nos preocuparemos apenas com o 
	processamento das Requisições.
    */

	//@GetMapping mapeia todas as Requisições HTTP GET, enviadas para um endereço específico, chamado endpoint, 
	//dentro do Recurso Postagem, para um Método específico que responderá a requisição, ou seja, ele indica que 
	//o Método getAll() responderá todas requisições do tipo HTTP GET, enviadas no http://localhost:8080/postagens/.
	@GetMapping
	
	//O Método getAll() será do tipo ResponseEntity porquê ele responderá a Requisição HTTP (HTTP Request), 
	//com uma Resposta HTTP (HTTP Response).
	//<list<postagem>>: O Método além de retornar um objeto da Classe ResponseEntity (OK 🡪200), no parâmetro body 
	//(Corpo da Resposta), será retornado um Objeto da Classe List (Collection), contendo todos os Objetos da Classe 
	//Postagem persistidos no Banco de dados, na tabela tb_postagens. Observe que nesta linha foi utilizado um 
	//recurso chamado Java Generics, que além de simplificar o retorno do Objeto da Classe List, dispensa o uso do 
	//casting (mudança de tipos). Observe que na definição do Método foram utilizados os símbolos , onde T é o 
	//Tipo do Objeto que será retornado no Corpo da Resposta.
	public ResponseEntity<List<Postagem>> getAll(){
		
		//return ResponseEntity.ok(postagemRepository.findAll()); Executa o Método findAll() (Método padrão da 
		//Interface JpaRepository), que retornará todos os Objetos da Classe Postagem persistidos no Banco de dados 
		//(<List<postagem>>). Como a List sempre será gerada (vazia ou não), o Método sempre retornará o Status 200 🡪 OK
		return ResponseEntity.ok(postagemRepository.findAll());
	}
	
}

/*
A Classe PostagemController será a Classe Controladora do Recurso Postagem, ou seja, ela irá responder toda e 
qualquer Requisição (HTTP Request), que for enviada de fora da aplicação para o Recurso Postagem. Dentro desta 
Classe iremos implementar os Métodos do CRUD (Create, Read, Update e Delete), que fazem parte da Interface 
JpaRepository e os Métodos Personalizados (Consultas), que serão assinados dentro da Interface PostagemRepository.
*/
