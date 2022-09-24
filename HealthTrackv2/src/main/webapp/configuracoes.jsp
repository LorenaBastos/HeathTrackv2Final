<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Configurações</title>

    <!-- Link do CSS-->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/configurações.css">

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
          <li><a href="./premium.html"><img src="./../images/crown-regular-24.png" alt="premium" width="50%" height="50%"></a></li>  
          <li><a href="./DashBoard.html">Home</a></li>
          <li><a href="./medidas.html">Medidas</a></li>
          <li><a href="./Nutrição.html">Nutrição</a></li>
          <li><a href="./../../index.html">Sair</a></li>
        </ul>
      </nav>
    </header>
    <section class="fundo">
      <div class="container">
        <div class="Senha">
          <a href="./pages/alterarSenha.html" class="btn-relatorio">Altere a sua senha</a>
        </div>
        <div class="Cartão">
          <a href="./pages/AlterarCartão.html" class="btn-relatorio">Altere a seu cartão</a>
        </div>
      </div>
    </section>
  </body>
</html>