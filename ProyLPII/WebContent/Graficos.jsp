<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
<link rel="stylesheet" href="css/estiloEstadistica.css" type="text/css">
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js">
</script>
</head>
<body>
	<div>
		<header>
			<h1 id="titulo">Estadisticas</h1>			
		</header>
			<div id="graficos">
				<section class="graficossection">
					<article id="artgraficobarra">
					</article>
					
				</section>
				<section class="graficossection">
					<article id="artgraficopie">


					</article>
					
				</section>
				
			</section>
			
		</div>
	<script src="js/estadistica.js"></script>
</body>
<script>
//var f = new Date();
//console.log(f.getDate() + "/" + (f.getMonth() +1) + "/" + f.getFullYear());	
var hoy = new Date();
var dd = hoy.getDate();
var mm = hoy.getMonth()+1; //hoy es 0!
var yyyy = hoy.getFullYear();

if(dd<10) {
    dd='0'+dd
} 

if(mm<10) {
    mm='0'+mm
	
} 
	hoy = yyyy+mm+dd;
	console.log(hoy);	
</script>

</html>