<%@ page import="beans.LocalDTO"%>
<%@ page import="service.LocalesService"%>
<%@ page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Ubicación</title>
<link rel="stylesheet" href="css/Mapa.css">
<link rel="stylesheet" href="css/BarraMenu.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
	integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css?family=Dancing+Script|Poiret+One"
	rel="stylesheet">
</head>
<body>
	<header id="menu-flex" class="menu-flex">
		<nav class="menu">
			<div class="logo-menu">
				<a href="" title="Logo"> <span class="title-logo-menu">
						Sirvetek </span>
				</a> <a href="javascript:void(0);" id="btn-menu" class="btn-menu"> <i
					id="hamburguer" class="fa fa-times-circle" aria-hidden="true"></i>
				</a>
			</div>

			<div id="links" class="links">
				<a href="PrincipalIndex.jsp" class="links-menu links-menu-active">
					<i class="fa fa-home icons-menu" aria-hidden="true"></i> Inicio
				</a> <a href="Categorias.jsp" class="links-menu"> <i
					class="fas fa-utensils" aria-hidden="true"></i> Carta
				</a> <a href="Mapa.jsp" class="links-menu"> <i
					class="fas fa-map-marked-alt" aria-hidden="true"></i> Ubicación
				</a> <a href="Contactenos.jsp" class="links-menu"> <i
					class="fa fa-envelope icons-menu" aria-hidden="true"></i>
					Contactenos
				</a> <a href="Nosotros.jsp" class="links-menu"> <i
					class="fas fa-users" aria-hidden="true"></i> Nosotros
				</a> <a href="Resumen.jsp" class="links-menu"> <i
					class="fas fa-shipping-fast" aria-hidden="true"></i> Ver Resumen
				</a>
			</div>
		</nav>
	</header>
	<div id="contenido">
		<div id="cabecera">
			<select id="LocalesSelect" onChange="cambioLocal()">
				<option value="">Seleccione un Local</option>
				<%
					LocalesService ls = new LocalesService();
					ArrayList<LocalDTO> listaLocales = ls.listar();
					if (listaLocales != null) {
						for (LocalDTO local : listaLocales) {
				%>
				<option value="<%=local.getIdLocal()%>"><%=local.getNombreLocal()%></option>
				<%
					}
					}
				%>
			</select>

		</div>
		<button type="button" id="VerTodos" onclick="verTodos()"
			class="botonVer">Ver todas las Sedes</button>
		<div id="map"></div>
	</div>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script type="application/ecmascript" src="js/BarraMenu.js"></script>
	<script src="js/Mapa.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRc59Ca614xfVdEAIkDF03paH4GTkudiA&callback=initMap"
		async defer></script>

	<script>
		var datos = [];
		$(document).ready(function() {
			$.ajax({
				url : "ListarLocal",
				dataType : 'json',
				error : function() {
					alert("Error Occured");
				},
				success : function(data) {
					datos = data;
					console.log(datos);
				}
			});
		});
		function verTodos() {
			$.ajax({
				url : "ListarLocal",
				dataType : 'json',
				error : function() {
					alert("Error Occured");
				},
				success : function(data) {
					datos = data;

					$.each(data, function(key, value) {
						var myLatLng = {
							lat : value.latitud_Locales,
							lng : value.longitud_Locales
						};
						var marker = new google.maps.Marker({
							position : myLatLng,
							map : map,
							title : value.nombre_Locales
						});
						marker.setMap(map);

					});

				}
			});
		}
		function cambioLocal() {
			$.ajax({
				url : "ListarLocal",
				dataType : 'json',
				error : function() {
					alert("Error Occured");
				},
				success : function(data) {
					datos = data;
					console.log(datos);
					console.log("joldd");
					var x = document.getElementById("LocalesSelect").value;
					console.log(x);
					$.each(data, function(key, value) {
						if (Number(value.id_Locales) == x) {
							var myLatLng = {
								lat : value.latitud_Locales,
								lng : value.longitud_Locales
							};
							var marker = new google.maps.Marker({
								position : myLatLng,
								map : map,
								title : value.nombre_Locales
							});
							marker.setMap(map);
						}

					});

				}
			});
		}
	</script>
</body>
</html>