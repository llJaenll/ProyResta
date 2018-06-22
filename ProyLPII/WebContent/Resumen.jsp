<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="css/estiloResumen.css">
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
        Ubicaci�n
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
<section class="products">
	
	<section class="products__header">
		<h1>Resumen de Pedido</h1>
		<p>Total S/150</p>
		<label for="Direccion">Direccion</label><input type="text" name="Direccion"><br>
		<input type="submit" value="Ordenar" id="btordenar">
	</section>
	
	<section class="container-products-item">
		<article class="products__item">
			<img src='imagenes/2.jpg'  class="product-img">
			<section class="product-desc" >
				<h3>Item name</h3>
				<h3>Precio : S/30</h3>				
				<h3>Cantidad : 3</h3>				
				<h3>Subtotal : S/90</h3>				
				
			</section>
			<div class="wrap-item-button"><a href="#more" class="item-button">Eliminar</a></div>
		</article>

	</section>
	
</section>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script type="application/ecmascript" src="js/BarraMenu.js"></script>
</body>
</html>