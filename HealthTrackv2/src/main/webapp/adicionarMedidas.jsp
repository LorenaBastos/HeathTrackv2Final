<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Adicionar Medidas</title>

    <!-- Link do CSS-->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/adicionar-style.css">

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
        <form action="Medidas" method="post">
          <div class="mb-3">
            <label for="name" class="form-label">Peso:</label>
            <input type="text" class="form-control" id="peso" aria-describedby="name">
          </div>
          <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Altura:</label>
            <input type="text" class="form-control" id="altura" aria-describedby="emailHelp">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">IMC:</label>
            <input type="text" class="form-control" id="imc">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">KQ Perdidos:</label>
            <input type="text" class="form-control" id="totalQuilosPerdidos">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Data de Pesagem:</label>
            <input type="date" class="form-control" id="dataPesagem">
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Press�o Arterial:</label>
            <input type="text" class="form-control" id="pressaoArterial">
          </div>
          <div class="d-flex justify-content-end">
            <a href="./adicionadosSucesso.html" class="btn btn-outline-light btn-lg mt-3">Adicionar Medidas</a>
          </div>
        </form>
      </div>
    </section>
  </body>
</html>