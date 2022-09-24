<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Esqueci minha senha</title>

    <!-- Link do CSS-->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/esqueci-style.css">

  </head>
  <body>
    <!-- Cabe�alho -->
    <header class="header">
      <!-- <img class="header-title" src="./images/idwall-logo-removebg-preview.png" alt="">-->
      <h1 id="logo-tipo">Health Track</h1>
      <input type="checkbox" id="btn-menu" class="btn-menu">
      <label for="btn-menu"><img src="./../images/menu-regular-24.png" alt="menu"></label>
      <nav id="header-menu" class="header-menu">
        <ul class="menu"> 
          <li><a href="./../../index.html">Home</a></li>
        </ul>
      </nav>
    </header>
    <section class="fundo">
      <div class="container">
        <form action="EsqueciMinhaSenha" method="post">
          <div class="mb-3">
            <label for="name" class="form-label">Informe seu e-mail:</label>
            <input type="text" class="form-control" id="email" aria-describedby="name">
          </div>
          <div class="d-flex justify-content-end">
            <a href="./esqueciSenha.html" class="btn btn-outline-light btn-lg mt-3">Enviar e-mail</a>
          </div>
        </form>
      </div>
    </section>
  </body>
</html>