<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="css/IndexPrincipal.css">
    <link rel="stylesheet" href="css/BarraMenu.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Dancing+Script|Poiret+One" rel="stylesheet">
</head>
<body>
<header id="menu-flex" class="menu-flex">
  <nav class="menu">
    <div class="logo-menu">
      <a href="" title="Logo">
        <span class="title-logo-menu">
          Sirvetek
        </span>
      </a>
      <a href="javascript:void(0);" id="btn-menu" class="btn-menu">
        <i id="hamburguer" class="fa fa-times-circle" aria-hidden="true"></i>
      </a>
    </div>
  
    <div id="links" class="links">
      <a href="Principal.jsp" class="links-menu links-menu-active">
        <i class="fa fa-home icons-menu" aria-hidden="true"></i>
        Inicio
      </a>
      
      <a href="Categorias.jsp" class="links-menu">
        <i class="fas fa-utensils" aria-hidden="true"></i>
        Carta
      </a>
      
      <a href="Mapa.jsp" class="links-menu">
        <i class="fas fa-map-marked-alt" aria-hidden="true"></i>
        Ubicación
      </a>
      
      <a href="Contactenos.jsp" class="links-menu">
        <i class="fa fa-envelope icons-menu" aria-hidden="true"></i>
        Contactenos
      </a>
       <a href="Nosotros.jsp" class="links-menu">
        <i class="fas fa-users" aria-hidden="true"></i>
        Nosotros
      </a>
       <a href="Resumen.jsp" class="links-menu">
        <i class="fas fa-shipping-fast" aria-hidden="true"></i>
        Ver Resumen
      </a>   
    </div>
  </nav>
</header>
	<div class="container">
	     <header id="cabecera">
			
				<h1 id="texto1">DELIVERY</h1>
				<img id="banner" src="img/banner.jpg" alt="">
				<h1 id="texto2">¿HAMBRIENTO?<br>
					ORDENE EN <br>CIRBETEK DELIVERY</h1>
			</header>
			<arcticle class="artComida">
				<center><img class="imgCambio" src="img/pescados.jpg" alt=""></center>
	
			</arcticle>
			<arcticle class="artComida">
				<center><img class="imgCambio" src="img/Carnes.jpg" alt=""></center>
			</arcticle>
			<arcticle class="artComida">
				<center><img class="imgCambio" src="img/rapida.jpg" alt=""></center>
			</arcticle>
			<arcticle class="artComida">
				<center><img class="imgCambio" src="img/pizza.jpg" alt=""></center>
			</arcticle>
	</div>
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script type="application/ecmascript" src="js/BarraMenu.js"></script>
	
</body>
</html>