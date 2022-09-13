package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//"restController" deﬁne que a Classe é do tipo controladora rest, que receberá requisições que serão compostas por:
//- URL: Endereço da requisição (/hello-world)
//- Verbo: Define qual Método HTTP será acionado na Classe controladora.
//- Corpo da requisição (Request Body): Objeto que contém os dados que serão criados ou atualizados.
//Após receber e processar a requisição, a Classe Controladora Responderá a estas requisições com:
//- Um Código de Status HTTP pertinente a operação que está sendo realizada
//- O resultado do processamento (Dados de uma consulta, por exemplo) inserido diretamente no corpo da resposta (Response Body)
@RestController

//"RequestMapping" é usada para mapear solicitações para os Métodos da Classe controladora HelloWorldController, ou seja,
//definir a URL (endereço) padrão do recurso (em nosso exemplo: /hello-world). Ao digitar a url do servidor seguida 
//da url do recurso, o Spring envia a requisição para a Classe responsável pelo recurso com este endereço.
//Ex: http://localhost:8080/hello-world é o endereço do recurso hello-world da Classe Controladora HelloWorldController
//Esse "hello-world" que eu escrevi é o endereço de uma endpoint!!
@RequestMapping("/hello-world")

//Primeiro vamos criar o pacote Controller, onde será criada a nossa Classe controladora
//É a primeira classe que eu crio com minhas próprias mãos:
public class HelloWorldController {
	
	//"GetMapping" mapeia solicitações HTTP GET para Métodos de tratamento específicos, ou seja, indica 
	//que o Método helloWorld() responderá a todas as requisições do tipo HTTP GET, enviadas no endereço 
	//http://localhost:8080/hello-world, do recurso hello-world.
	@GetMapping
	public String helloWorld() {
		
		//O método helloWorld() retorna uma mensagem de boas vindas, ou seja, 
		//quando o endereço for enviado via Postman ou via Browser (Navegador), será exibida a mensagem "Hello World!!!"
		return "Hello World!!!";
	}

}
