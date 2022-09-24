<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Login</title>

    <!-- Link do CSS-->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/login-style.css">
    <!-- Link do JS -->
    <link rel="stylesheet" href="./js/js.js">

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
                <li><a href="./../../index.html">Home</a></li>
            </ul>
        </nav>
    </header>
    <section class="login">
        <section class="login2">
            <div>
                <h1 class="title">Acesse sua conta</h1>
                <form action="">
                   <div class="mb-3">
                      <label for="name" class="form-label">Nome:</label>
                      <input type="text" class="form-control" id="name" aria-describedby="name">
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Senha:</label>
                      <input type="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                </form>
                <div class="box">
                   <h1><img src="./../images/error-regular-24.png" alt="erro">Usuario e/ou senha errados</h1>
                </div>
                <div class="btn-conta">
                    <!-- botão para acessar conta -->
                    <a href="./DashBoard.html" class="btn-conta">Acessar Conta</a>
                </div>
                <div class="btn-esqueci">
                    <!-- botão de esqueci senha -->
                    <a href="./esqueci.html" class="btn-esqueci">Esqueci minha senha</a>
                </div>
            </div>
            <div class="btn-redes">
                <!-- botão facebook -->
                <div class="facebook">
                    <a href="https://pt-br.facebook.com/" target="_blank"><img src="./../images/facebook-circle-logo-156.png" alt="facebook"></a>  
                </div>  
                <div class="google">
                    <!-- botão google -->
                    <a href="https://accounts.google.com/signin/v2/identifier?hl=pt-BR&passive=true&continue=https%3A%2F%2Fwww.google.com%2Fwebhp%3Fhl%3Dpt-BR%26sa%3DX%26ved%3D0ahUKEwjW5tK5_pD2AhUSE7kGHawgA6QQPAgI&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin" target="_blank"><img src="./../images/google-plus-circle-logo-156.png" alt="google" ></a>  
                </div>
                <div class="apple">
                    <!-- botão apple -->
                    <a href="https://secure4.store.apple.com/br/shop/signIn?ssi=1AAABfxym2kkgQMoGnAghQkQeudLZAmqUpcOzPdavzYtPHQaOz2oUnccAAAA0aHR0cHM6Ly93d3cuYXBwbGUuY29tL2JyL3xodHRwczovL3d3dy5hcHBsZS5jb20vYnIvfAACATM_h1_AkBbh-ILJSHALMscMxBm25BW3Iu3osYpcrVCO" target="_blank"><img src="./../images/apple-logo-156.png" alt="apple"></a>  
                </div>
            </div>
       </section>
    </section>
</body>
</html>
