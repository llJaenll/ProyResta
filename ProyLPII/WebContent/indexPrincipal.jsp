<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Index Principal</title>
	<link rel="stylesheet" href="css/IndexPrincipal.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
</head>
	<body>
		<nav id="menu">
			<ul>
				<li class="palo"><li>
				<li class="barra"><a href="Principal.jsp" target="form">Inicio</a></li>
				<li class="palo"><hr class="v" /></li>
				<li class="barra"><a href="">Carta</a></li>
				<li class="palo"><hr class="v" /></li>
				<li class="barra"><a href="Mapa.jsp" target="form">Ubicación</a></li>
				<li class="palo"><hr class="v" /></li>
				<li class="barra"><a href="Contactenos.jsp" target="form">Contactenos</a></li>
				<li class="palo"><hr class="v" /></li>
				<li class="barra"><a href="">Nosotros</a></li>
			</ul>
		</nav>
		
		<div id="contenido">
			<header id="cabecera">
			
				<h1 id="texto1">DELIVERY</h1>
				<img id="banner" src="img/banner.jpg" alt="">
				<h1 id="texto2">¿HAMBRIENTO?<br>
					ORDENE EN <br>CIRBETEK DELIVERY</h1>
			</header>
			<article class="artComida">
				<center><img class="imgCambio" src="img/pescados.jpg" alt=""></center>
	
			</article>
			<article class="artComida">
				<center><img class="imgCambio" src="img/Carnes.jpg" alt=""></center>
			</article>
			<article class="artComida">
				<center><img class="imgCambio" src="img/rapida.jpg" alt=""></center>
			</article>
			<article class="artComida">
				<center><img class="imgCambio" src="img/pizza.jpg" alt=""></center>
			</article>
		</div>
		<div id="contenido1">
		<iframe  style="width: 100%; height:1000px;border: 0; display:none;" name="form" id="ifr"></iframe>
		</div>
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script>
			var fondo=document.getElementById("contenido");
			if(fondo!=undefined){
				$( ".barra" ).click(function() {
					  $( "#contenido" ).remove();
					  $("#ifr").css("display","block");
					});
			}
		
			$(document).ready(function(){
				$(".barra").mouseover(function(){
					//$(this).animate({"background-color":"#fff"},600);
					$(this).find("a").css("color","#e67965");
					$(this).find("a").css("background-color","#fff");
				});
				$(".barra").mouseout(function(){
					$(this).find("a").css("color","#fff");
					$(this).find("a").css("background-color","#e67965");
				});

			});

		</script>
	</body>
</html>