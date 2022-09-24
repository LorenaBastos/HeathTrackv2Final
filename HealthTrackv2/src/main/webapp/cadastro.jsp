<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Cadastro</title>

    <!-- Link do CSS-->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/cadastro.css">

  </head>
  <body>
    <!-- Cabeçalho -->
    <header class="header">
      <!-- <img class="header-title" src="./images/idwall-logo-removebg-preview.png" alt="">-->
      <h1 id="logo-tipo">Health Track</h1>
      <input type="checkbox" id="btn-menu" class="btn-menu">
      <label for="btn-menu"><img src="./../images/menu-regular-24.png" alt="menu"></label>
      <nav id="header-menu" class="header-menu">
        <ul class="menu">  
          <li><a href="./../../index.html">Sair</a></li>
        </ul>
      </nav>
    </header>
    <section class="fundo">
      <div class="container">
        <form action="Cadastro" method="post">
          <div class="mb-3">
            <label for="name" class="form-label">Nome:</label>
            <input type="text" class="form-control" id="nome" aria-describedby="name">
          </div>
          <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label" id="cpf">CPF:</label>
            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label" id="dataDeNascimento">Data de Nascimento:</label>
            <input type="date" class="form-control" id="exampleInputPassword1">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label" id="email">E-mail:</label>
            <input type="email" class="form-control" id="exampleInputPassword1">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label" id="Genero">Genero:</label>
            <input type="text" class="form-control" id="exampleInputPassword1">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label" id="senha">Senha:</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label" id="senha">Confirme sua senha:</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
          </div>
          <div class="d-flex justify-content-end">
            <a href="./cadastroRealizado.jsp" class="btn btn-outline-light btn-lg mt-3">Cadastrar</a>
          </div>
        </form>
      </div>
    </section>
  </body>
</html>