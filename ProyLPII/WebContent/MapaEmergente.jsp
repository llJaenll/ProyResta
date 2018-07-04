<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Mapa</title>
	<link rel="stylesheet" href="css/Mapa.css">
	<link href="https://fonts.googleapis.com/css?family=Dancing+Script|Poiret+One" rel="stylesheet">
</head>
<body>
	<div id="contenido">
		<div class="titulo">
			<h1>Entrega</h1>
		</div>
		<div id="map"></div>
	</div>
	<script src="js/MapaEmergente.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRc59Ca614xfVdEAIkDF03paH4GTkudiA&callback=initMap&libraries=geometry"
    async defer></script>

</body>
</html>