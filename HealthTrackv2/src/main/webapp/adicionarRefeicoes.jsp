<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Adicionar Refeições</title>

    <!-- Link do CSS-->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/addRefeição-style.css">

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
          <li><a href="./configurações.html">Configurações</a></li>
          <li><a href="./medidas.html">Medidas</a></li>
          <li><a href="./Nutrição.html">Nutrição</a></li>
          <li><a href="./../../index.html">Sair</a></li>
        </ul>
      </nav>
    </header>
    <section class="fundo">
      <div class="container">
        <form action="Refeicoes" method="post">
          <div class="mb-3">
            <label for="name" class="form-label">Refeição:</label>
            <input type="text" class="form-control" id="tipoRefeicao" aria-describedby="name">
          </div>
          <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Kcalorias:</label>
            <input type="text" class="form-control" id="qtdKcal" aria-describedby="emailHelp">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Data da Refeição:</label>
            <input type="date" class="form-control" id="dtRefeicao">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Dieta:</label>
            <input type="text" class="form-control" id="dieta">
          </div>
          <div class="d-flex justify-content-end">
            <a href="./refeiçõesSucesso.html" class="btn btn-outline-light btn-lg mt-3">Adicionar Refeição</a>
          </div>
        </form>
      </div>
    </section>
  </body>
</html>