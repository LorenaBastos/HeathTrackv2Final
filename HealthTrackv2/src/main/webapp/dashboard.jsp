<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
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

    <title>Dashboard</title>

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
                <li><a href="./configurações.html">Configurações</a></li>
                <li><a href="./medidas.html">Medidas</a></li>
                <li><a href="./Nutrição.html">Nutrição</a></li>
                <li><a href="./../../index.html">Sair</a></li>
              </ul>
           </nav>
      </header>
        <section class="body"> 
            <div class="container-fluid grid">
                <div class="row" style="margin: 80px;">
                 <!-- 1a coluna do grid -->
              
                    <div class="card blue">
                        <img src="../images/pexels-klaus-nielsen-6303435.jpg" class="ms-4" alt="Gluteos" width="75%" height="100%">
                        <div class="card-body">
                            <h5 class="card-title">Exercicio para Gluteos</h5>
                            <p class="card-text">Treino de 10 min para o gluteos para fazer em casa</p>
                            <a href="../pages/gluteos.html" class="btn">Começar</a>
                        </div>
                    </div>
                
                 <!-- 2a coluna do grid -->
                
                    <div class="card blue">
                        <img src="../images/pexels-mart-production-8032754.jpg" class="ms-4" alt="Pernas" width="75%" height="100%">
                        <div class="card-body">
                           <h5 class="card-title">Exercicio para Pernas</h5>
                           <p class="card-text">Treino de 10 min para as pernas para fazer em casa</p>
                           <a href="../pages/pernas.html" class="btn">Começar</a>
                        </div>
                    </div>
                
                 <!-- 3a coluna do grid -->
                
                    <div class="card blue">
                        <img src="../images/pexels-pixabay-416809.jpg" class="ms-4" alt="Braços" width="75%" height="100%">
                        <div class="card-body">
                            <h5 class="card-title">Exercicio para Braços</h5>
                            <p class="card-text">Treino de 10 min para os braços para fazer em casa</p>
                            <a href="../pages/braços.html" class="btn">Começar</a>
                        </div>
                    </div>
                
                 <!-- 4a coluna do grid -->
               
                    <div class="card blue">
                        <img src="../images/pexels-nataliya-vaitkevich-4939443.jpg" class="ms-4" alt="Abdomen" width="75%" height="100%">
                        <div class="card-body">
                            <h5 class="card-title">Exercicio para Abdomen</h5>
                            <p class="card-text">Treino de 10 min para o abdomen para fazer em casa</p>
                            <a href="../pages/abdomen.html" class="btn">Começar</a>
                        </div>
                    </div>
                 <!-- 5a coluna do grid -->
                    <div class="card blue">
                        <img src="./../images/plus-circle-regular-48.png" class="ms-4" alt="Abdomen" width="75%" height="100%">
                        <div class="card-body">
                            <h5 class="card-title">Crie seu Treino</h5>
                            <p class="card-text">Escolha seus exercicios e crie seu treino</p>
                            <a href="" class="btn">Começar</a>
                        </div>
                    </div>
                </div>  
            </div>
        </section>

    
       <!-- Option 1: Bootstrap Bundle with Popper -->
       <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>