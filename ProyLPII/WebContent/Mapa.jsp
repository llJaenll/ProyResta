<%@ page import= "beans.LocalDTO" %> 
<%@ page import= "service.LocalesService" %> 
<%@ page import= "java.util.ArrayList" %> 

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
		<select id="LocalesSelect">
		<option value="">Seleccione un Local</option>
		<%
		LocalesService ls=new LocalesService();
		ArrayList<LocalDTO> listaLocales=ls.listar();
		if(listaLocales!=null){
			for(LocalDTO local:listaLocales){

		%>
				<option value="<%=local.getIdLocal()%>"><%=local.getNombreLocal()%></option>
		<% 	}
		}%>
			</select>
		</div>
		<button type="button" id="VerTodos" class="boton_personalizado">Ver todas las Sedes</button>
		<div id="map"></div>
	</div>
	  <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="js/Mapa.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRc59Ca614xfVdEAIkDF03paH4GTkudiA&callback=initMap"
    async defer></script>
  
	<script>
	
	  $(document).ready(function(){
			$.ajax({
	          url : "ListarLocal",
	          dataType : 'json',
	          error : function() {
	              alert("Error Occured");
	          },
	          success : function(data) {
	        	var datos=data;
	          }
	      });
		});
    	$('#LocalesSelect').change(function(){
    	    var selectedOption = $(this).find('option:selected');
    	    var selectedValue = $selectedOption.val();
    	    	$.each(data,function(key,value){
    	    		var myLatLng = {lat:value.latitud_Locales, lng:longitud_Locales};
	        	    var marker = new google.maps.Marker({
	        	        position: myLatLng,
	        	        map: map,
	        	        title:value.nombre_Locales
	        	    });
    	    	});
    	    	
    	});
	  
	
	</script>
</body>
</html>