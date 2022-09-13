package com.helloworld.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Esse "SpringBootApplication" indica que o projeto é do tipo Spring Boot Application:
//Esta anotação inicializa várias configurações padrão em projetos Spring Boot, além de scannear os pacotes em busca 
//das Classes que compõe a aplicação, inicializando as configurações especificas de cada uma:
@SpringBootApplication

//Essa é a classe principal, responsável por inicializar o nosso projeto:
//Gerada automaticamente pelo Spring Boot durante a criação do projeto. Raramente precisaremos fazer alterações nela:
public class HelloworldApplication {

	public static void main(String[] args) {
		
		//Método run da Classe SpringApplication inicializa a aplicação executando a Classe Principal da aplicação 
		//A Classe SpringApplication fornece uma maneira simples de inicializar um aplicativo Spring que é iniciado 
		//a partir de um Método main() (Semelhante ao do Java), onde é indicada a Classe principal da Aplicação.
		SpringApplication.run(HelloworldApplication.class, args);
	
	}

}

//É essa classe aqui que você vai botar pra rodar quando quiser rodar o programa!
//Run as -> Spring boot app
//Se estiver tudo certo, o Console exibirá no final: Started Helloworld1Application in 4.846 sec (JVM running for 6.01)

