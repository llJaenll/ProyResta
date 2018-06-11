<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Mapa</title>
	<link rel="stylesheet" href="css/Mapa.css">
	
</head>
<body>
	<div id="contenido">
		<div id="cabecera" class="custom-select" style="width:200px;">
			<select name="" id="">
				<option value="">Seleccione un Local</option>
				<option value="">Miraflores</option>
				<option value="">San Juan</option>
				<option value="">Molina</option>
			</select>
		</div>
		<button type="button" id="VerTodos" class="boton_personalizado">Ver todas las Sedes</button>
		<div id="map"></div>
	</div>
	<script src="js/Mapa.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRc59Ca614xfVdEAIkDF03paH4GTkudiA&callback=initMap"
    async defer></script>
	
</body>
</html>