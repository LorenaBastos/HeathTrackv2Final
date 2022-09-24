<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alterar Senha</title>

    <!-- Link do CSS-->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/cart�o.css">

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
          <li><a href="./premium.html"><img src="./../images/crown-regular-24.png" alt="premium" width="50%" height="50%"></a></li>  
          <li><a href="./DashBoard.html">Home</a></li>
          <li><a href="./configura��es.html">Configura��es</a></li>
          <li><a href="./medidas.html">Medidas</a></li>
          <li><a href="./Nutri��o.html">Nutri��o</a></li>
          <li><a href="./../../index.html">Sair</a></li>
        </ul>
      </nav>
    </header>
    <section class="fundo">
      <div class="container">
        <form method="post" action="AlterarSenha">
          <div class="mb-3">
            <label for="name" class="form-label">Insira nova senha:</label>
            <input type="text" class="form-control" id="senha" aria-describedby="name">
          </div>
          <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Confirme a Senha :</label>
            <input type="password" class="form-control" id="senha" aria-describedby="emailHelp">
          </div>
          <div class="d-flex justify-content-end">
            <a href="./senhaAlterada.html" class="btn btn-outline-light btn-lg mt-3">Alterar Senha</a>
          </div>
        </form>
      </div>
    </section>
  </body>
</html>