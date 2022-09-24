<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<<!doctype html>
<html lang="pt-BR">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <!-- Link do CSS-->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/login-style.css">
    <link rel="stylesheet" href="./css/dashboard-style.css">
    <link rel="stylesheet" href="./css/medidas-style.css">

    <title>Medidas</title>

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
          <li><a href="./Nutrição.html">Nutrição</a></li>
          <li><a href="./../../index.html">Sair</a></li>
        </ul>
      </nav>
    </header>
    <section class="medidas">
      <div class="adicionar">
        <section class="relatorio">
          <a href="./adicionarMedidas.html" class="btn-relatorio"><img src="./../images/plus-circle-regular-48.png" alt="" width="25%" height="25%"> Adicionar Medidas</a>
        </section>
      </div>
    <section>
    <!-- tabela-->
    <section class="tabela">
      <table>
        <h2>Relatório</h2>
        <div class="table-responsive">
          <thead class="table table-striped table-sm">
            <tr>
              <th>Data da atualização</th>
              <th>Peso</th>
              <th>Altura</th>
              <th>IMC</th>
              <th>KQ Perdidos</th>
              <th>Pressão Arterial</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>17/03/2022</td>
              <td>89</td>
              <td>1.70</td>
              <td>30.8</td>
              <td>0</td>
              <td>12/8</td>
            </tr>
            <tr>
              <td>18/03/2022</td>
              <td>85</td>
              <td>1.70</td>
              <td>29.41</td>
              <td>4</td>
              <td>12/8</td>
            </tr>
            <tr>
              <td>19/03/2022</td>
              <td>80</td>
              <td>1.70</td>
              <td>27.68</td>
              <td>5</td>
              <td>12/8</td>
            </tr>
            <tr>
              <td>20/03/2022</td>
              <td>80</td>
              <td>1.70</td>
              <td>27.68</td>
              <td>0</td>
              <td>12/8</td>
            </tr>
            <tr>
              <td>21/03/2022</td>
              <td>82</td>
              <td>1.70</td>
              <td>28.37</td>
              <td>-2</td>
              <td>12/8</td>
            </tr>
          </tbody>
        </div>  
      </table>
      <!-- Final da tabela-->     
    </section>
  </body>
</html>