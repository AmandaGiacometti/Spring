package com.generation.tarefablogpessoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//É essa classe que você vai executar! Run as Spring boot application
public class TarefablogpessoalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarefablogpessoalApplication.class, args);
	}

}

/*
SOBRE O POM.XL:
O POM é um arquivo XML, que dentro do contexto de um projeto Maven, é o arquivo mais importante do projeto. 
Guarda todas as informações básicas de um projeto Maven, bem como as diretivas de como o artefato (resultado) final 
deste projeto deve ser construído. Dentro do POM colocamos as informações das Bibliotecas (Dependências), que 
o nosso projeto necessita para funcionar e o Maven se encarrega de efetuar o download e inserir no Build Path 
(Caminho para as Bibliotecas utilizadas pelo compilador Java para construir o projeto final) e Classpath 
(Caminho para os pacotes utilizados no projeto durante o desenvolvimento das Classes, ou seja, as instruções Import).
O Maven irá buscar por essas Dependências em locais chamados Repositórios. 
Existem dois repositórios, o local que está localizado na pasta .m2/repository e o remoto Maven Repository.
Ao adicionar uma nova Dependência no projeto, o Maven primeiro realiza a busca no Repositório Local. 
Se a Dependência não for encontrada, o Maven irá buscar as Dependências no Repositório Remoto e fará o download 
no Repositório Local. Após o download, o Maven disponibilizará a Dependência no Repositório Local para todos 
os projetos Spring. Caso você necessite utilizar a mesma Dependência em outro projeto não será necessário 
realizar o download novamente.
*/

/*
Antes de iniciarmos o desenvolvimento das Classes, precisamos configurar o o acesso ao nosso Banco de dados, 
caso contrário ao executar o projeto receberemos a mensagem de erro no Console.
A configuração do Banco de dados será no arquivo application.properties localizado na Source Folder src/main/resources
Os properties são usados para manter diversas propriedades do projeto em um único arquivo para executar o 
aplicativo em um ambiente diferente. Neste arquivo você pode configurar além do Banco de dados o Spring Mail 
para enviar e-mails pela aplicação, Configurações do Servidor, entre outras.
*/
