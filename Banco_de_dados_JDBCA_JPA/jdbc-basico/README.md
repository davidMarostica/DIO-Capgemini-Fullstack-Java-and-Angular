Projeto Java JDBC Básico (DIO)

Este repositório contém o projeto fundamental para a aula básica sobre JDBC (Java Database Connectivity), focado em demonstrar a conectividade, o gerenciamento de drivers e a execução de comandos SQL em um ambiente Java.

O projeto é parte do material didático disponibilizado pela Digital Innovation One (DIO).

🌟 Visão Geral do Projeto

A meta deste projeto é fornecer uma base sólida sobre como aplicações Java interagem diretamente com um banco de dados relacional (MySQL, neste caso), cobrindo o ciclo básico de conexão e manipulação de dados.

    Tecnologia Principal: JDBC API (Java Database Connectivity).

    Banco de Dados: MySQL (via Connector/J).

    Gerenciamento de Dependências: Gradle Wrapper.

    Requisito de Linguagem: Java 17+.

🛠️ Pré-requisitos de Desenvolvimento

Para configurar e executar o projeto com sucesso, garanta que os seguintes softwares estejam instalados em sua máquina:
Requisito	Versão Recomendada	Notas
Java Development Kit (JDK)	17 ou superior	Essencial para compilação e execução.
IDE (Ambiente de Desenvolvimento)	IntelliJ IDEA	Recomendada para uma importação fácil via Gradle.
Banco de Dados	MySQL Server	Necessário para a execução dos testes.
Build Tool	Gradle Wrapper	Já incluído no projeto para gerenciar o build.

🚀 Guia de Instalação e Execução

Siga os passos para ter uma cópia de trabalho do projeto em seu ambiente.

1. Clonagem do Repositório

Baixe o projeto para sua máquina local utilizando o comando git clone no terminal:
Bash

git clone <URL_DO_SEU_REPOSITORIO>

2. Configuração do Banco de Dados

Antes de executar o código Java, o ambiente do banco de dados deve ser inicializado:

    Localize o arquivo DatabaseInstructions na raiz do projeto.

    Execute todos os scripts SQL contidos neste arquivo (geralmente criação do esquema, tabelas e inserção dos dados de teste).

    Observação: Certifique-se de que o MySQL está em execução e acessível.

3. Importação na IDE

    Abra sua IDE (IntelliJ recomendado).

    Importe o projeto como um projeto Gradle Existente. A IDE detectará o build.gradle e baixará automaticamente o driver MySQL Connector/J.

    O build.gradle já contém a dependência do MySQL atualizada, corrigindo potenciais erros de build em ambientes mais recentes.

4. Ajuste da Conexão

Verifique as credenciais de conexão na classe responsável por estabelecer o JDBC (ex: ConnectionFactory ou similar) e ajuste o url, user e password para corresponderem à sua configuração local do MySQL.

5. Execução

Execute a classe principal do projeto diretamente pela IDE para rodar os testes e exemplos de código da aula.
