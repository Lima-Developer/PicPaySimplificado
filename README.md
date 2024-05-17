<h1 align="center">PicPay Simplificado</h1>
<p align="center">Bem vindo ao repositório da API REST do PicPay simplificado! Este projeto visa simular as funcionalidades básicas do PicPay, permitindo fluxo de transferência entre dois usuários, cadastro de usuários e chamada para visualização de todos os usuários cadastrados.</p>
<h2>Índice</h2>
<ol>
  <li><a href="#Description">Descrição</a></li>
  <li><a href="#Functions">Funcionalidades</a></li>
  <li><a href="#Tech">Tecnologias Utilizadas</a></li>
  <li><a href="#">Créditos</a></li>
</ol>
<h2 id="Description">Descrição</h2>
<p>Esta API REST foi desenvolvida para simular um sistema de pagamentos simplificado. Ela permite que usuários sejam cadastrados de acordo com o seu tipo específico (Comuns ou Lojistas/ COMMON or MERCHANT), mostre todos os usuários cadastrados e que eles
  possam executar transações entre si desde que sejam do tipo COMMON. O objetivo era executar um sistema que fosse capaz de diferenciar tipos de usuário (comuns e lojistas) e permitisse a transação entre usuários comuns, e entre comuns e lojistas funcionando apenas por um fluxo de transferência, onde os lojistas apenas podem receber
  transações. </p>
<h2 id="Functions">Funcionalidades</h2>
<ul>
  <li>Registro de Usuários</li>
  <li>Lista de Usuários Cadastrados</li>
  <li>Validação de Tipo do Usuário</li>
  <li>Transferência de valores entre usuários</li>
</ul>
<h2 id="Tech">Tecnologias</h2>
<ul>
  <li><strong>Linguagem:</strong> Java</li>
  <li><strong>Framework:</strong> Spring Framework</li>
  <li><strong>Banco de Dados:</strong> Spring JPA (Java Persistence API) integrado com Spring H2 database (Banco em Memória)</li>
  <li><strong>Outras Dependências:</strong> Spring Web, Spring lombok e Spring DevTools</li>
</ul>
<h2>Crétidos</h2>
<p>Projeto executado pela <a href="https://github.com/Fernanda-Kipper">@Fernanda-Kipper</a>. Reproduzido por mim para aprendizado e prática de estudos</p>
 
