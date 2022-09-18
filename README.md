
<h1 align="center">
 Desafio Selenium
</h1>

<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-layout">Arquitetura</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-como-executar">Como executar</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-licença">Licença</a>
</p> 

## ⚙ Tecnologias

Esse projeto foi desenvolvido com a sintax Gherkin e com as seguintes tecnologias:

- [Java](https://www.java.com/pt-BR/)
- [Cucumber](https://cucumber.io/)
- [Selenium](https://www.selenium.dev/)

## 💻 Projeto

Criar um projeto em selenium webdrive(java) e cucumber usando Page objects

Passo a passo para o teste automático (colocar algum verificador do objeto antes de fazer as ações):
* Entrar no site http://sampleapp.tricentis.com/101/app.php
* Preencher o formulário, aba “Enter Vehicle Data” e pressione next
* Preencher o formulário, aba “Enter Insurant Data” e pressione next
* Preencher o formulário, aba “Enter Product Data” e pressione next
* Preencher o formulário, aba “Select Price Option” e pressione next
* Preencher o formulário, aba “Send Quote” e pressione Send
* Verificar a mensagem “Sending e-mail success!” na tela

## 🔖 Arquitetura

O projeto foi seguido a risca a lista a cima, por tanto segue um conceito de teste de aceitação analisando apenas se o fluxo descrito a cima esta funcionando, foi analisado alguns impedimentos que poderiam ser analisados pelo produto como, placa do veiculo sem regra definida (podendo colocar apenas um numero), street addres e City sem padronização de local etc.

Porem em nivel de codigo foi seguido uma arquitetura simples de fluxo completo em apenas um Cenário e documentado pelos comentarios a funcionalidade de cada processo.

## 🚀 Como executar

- Precisamos do Java JDK8 ou Superior
- Recomendo a IDE do Eclipse
- Maven
- Selenium
- Cucumber
- Junit 4
- Chromedriver compativel com a versão do nevegador (Ao clonar e abrir o projeto subistitua o chromedriver pelo compativel)

## 📄 Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.

---

### Autor


 <img style="border-radius: 50%" src="https://instagram.fssz3-1.fna.fbcdn.net/v/t51.2885-19/s150x150/116748339_316119582912608_1240945628270052240_n.jpg?tp=1&_nc_ht=instagram.fssz3-1.fna.fbcdn.net&_nc_ohc=OTUbF77fF4UAX9Eu0xd&oh=aa0d3375f67363c3cd36f1de27a84f00&oe=60642060" width="100px" alt=""/>

 <sub><b>Carlos Vinicius</b></sub></a> <a href="">🚀</a>
<br />

Feito por Carlos Vinicius!

[![Linkedin Badge](https://img.shields.io/badge/-Carlos-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://https://www.linkedin.com/in/carlos-vinicius-95745a1a4)](https://www.linkedin.com/in/carlos-vinicius-95745a1a4) 
[![Gmail Badge](https://img.shields.io/badge/-carlosvinicius.index@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:carlosvinicius.index@gmail.com)](mailto:carlosvinicius.index@gmail.com)

