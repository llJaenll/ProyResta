<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="css/PrincipalSlider.css">
	<link rel="stylesheet" href="css/estilosPrincipal.css">
	<link rel="stylesheet" href="css/BarraMenu.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
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
      <a href="" class="links-menu links-menu-active">
        <i class="fa fa-home icons-menu" aria-hidden="true"></i>
        Inicio
      </a>
      
      <a href="" class="links-menu">
        <i class="fas fa-utensils" aria-hidden="true"></i>
        Carta
      </a>
      
      <a href="" class="links-menu">
        <i class="fas fa-map-marked-alt" aria-hidden="true"></i>
        Ubicación
      </a>
      
      <a href="" class="links-menu">
        <i class="fa fa-envelope icons-menu" aria-hidden="true"></i>
        Contactenos
      </a>
       <a href="" class="links-menu">
        <i class="fas fa-users" aria-hidden="true"></i>
        Nosotros
      </a>  
    </div>
  </nav>
</header>
	<head>
	<div class="slider">
		<img id="imgBan" src="img/banner1.jpg" alt="">
	</div>
		
	</head>
	<div class="titulo">
		<h1>Principales Ofertas</h1>
	</div>
	<div class="contentAll">
		<div class="contenedor">
			<div class="carta">
				<div class="lado frente">
					<img src="img/causaOferta.jpg" alt="">
				</div>
				<div class="lado atras">
					<div class="content-txt">
						<h2>Arroz con Pollo</h2>
						<label for="">Cant: </label><input type="number" class="caja"><br>
						<button type="submit" class="bot">Pedir</button>				
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/PrincipalSlider.js"></script>
<script type="application/ecmascript" src="js/BarraMenu.js"></script>
</html>