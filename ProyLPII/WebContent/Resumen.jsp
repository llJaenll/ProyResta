<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="beans.DetalleDeliveryDTO"%>
<%@page import="beans.ProductoDTO"%>
<%@page import="service.ProductoService"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
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
      <a href="PrincipalIndex.jsp" class="links-menu links-menu-active">
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
<div id="map"></div>
<section class="products">

	<%
	ArrayList<DetalleDeliveryDTO> carro = (ArrayList<DetalleDeliveryDTO>)request.getSession().getAttribute("carroD");
	Double totalventa=(Double)request.getSession().getAttribute("totalventa");
	%>	
	<section class="products__header">
	<form action="RealizarOrden">
		<h1>Resumen de Pedido</h1>
		<center><p>Total S/<%=totalventa%> </p></center>
		<%if(totalventa<=0){%>
		
			<input type="button" value="Ordenar" id="btordenar" data-toggle="modal" data-target="#exampleModal" disabled> 
		<%}else{ %>
			<input type="button" value="Ordenar" id="btordenar" data-toggle="modal" data-target="#exampleModal"> 
		<%} %>
			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog" role="document">
				<div class="modal-content">
				  <div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Datos Personales</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					  <span aria-hidden="true">&times;</span>
					</button>
				  </div>
				  <div class="modal-body">
					<form>
					  <div class="form-group">
						<label for="nombre" class="col-form-label">Nombre Completo:</label>
						<input type="text" class="form-control" id="nomDel" name="nomDel" tabindex="0" maxlength="80" pattern="[A-Za-z]{1,80}" title="Introduce entre 1 y 80 letras" required>
					  </div>
					   <div class="form-group">
						<label for="nombre" class="col-form-label">DNI:</label>
						<input type="text" class="form-control" id="dniDel" name="dniDel"  tabindex="0" maxlength="8" pattern="[0-9]{8}" title="Introduce solo 8 digitos" required>
					  </div> 
					  <div class="form-group">
						<div class="input-group mb-3">
						  <div class="input-group-prepend">
						    <button class="btn btn-outline-primary" type="button" onclick="obtener()">Obtener Dirección</button>
						  </div>
						  <input type="text" id="dir" name="dir" class="form-control" placeholder="Direccion" aria-label="" aria-describedby="basic-addon1" disabled>
						</div>
					  </div> 
					  <div class="form-group">
						<label for="nombre" class="col-form-label" required>Pago:</label>
						 <select class="custom-select mr-sm-2" id="pagoDel" name="pagoDel" required>
							<option selected value="">Tipo de Pago</option>
							<option value="Efectivo">Efectivo</option>
							<option value="Tarjeta">Tarjeta</option>
						  </select>
					  </div>
					  <div class="form-group">
						<label for="message-text" class="col-form-label">Observaciones para el pedido:</label>
						<textarea class="form-control" id="obsDel" name="obsDel" tabindex="0" maxlength="80" pattern="[A-Za-z]{1,80}" title="Introduce entre 1 y 80 letras" required></textarea>
					  </div>
					   <div class="form-group">
						<div class="alert alert-primary" role="alert">
						  	<center><p>Total de su pedido <%=totalventa %></p></center>
						  	
						</div>
					  </div>
					</form>
				  </div>
				  <div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
					<a id="llamarO" onclick="llamarServletOrdenar()" class="btn btn-primary">Ordenar</a>
				  </div>
				</div>
			  </div>
			</div>
		
	</form>
	</section>
	<%
	for(DetalleDeliveryDTO dt : carro){	
		ProductoService ps = new ProductoService();
		ProductoDTO p= ps.buscarProductoCod(dt.getIdProducto());
		
	%>

	<section class="container-products-item">
		<article class="products__item">
			<img src='img/productos/<%=dt.getIdProducto() %>.jpg'  class="product-img">
			<section class="product-desc" >
				<h3>Nombre: <%=p.getDescripcion() %></h3>
				<h3>Precio : S/<%=dt.getPrecioProducto() %></h3>				
				<h3>Cantidad : <%=dt.getCantidad() %></h3>				
				<h3>Subtotal : S/<%=dt.getSubtotal() %></h3>				
			</section>
			<div class="wrap-item-button"><a id="llamar" onclick="llamarServlet(<%=p.getCodigo()%>,<%=dt.getCantidad()%>)" class="item-button">Eliminar</a></div>

		</article>
	
	</section>
	<%} %>
	
</section>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script type="application/ecmascript" src="js/BarraMenu.js"></script>
	<script type="text/javascript" src="js/resumen.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
	<script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRc59Ca614xfVdEAIkDF03paH4GTkudiA&callback=initMap">
    </script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2"></script>
	<script src="https://cdn.jsdelivr.net/npm/promise-polyfill"></script>
    <script type="text/javascript">
    function llamarServlet(codigo,c){
    	swal({
    		  title: 'Esta Seguro que desea eliminar el plato?',
    		  text: "Esto nose puede revertir",
    		  type: 'warning',
    		  showCancelButton: true,
    		  confirmButtonColor: '#3085d6',
    		  cancelButtonColor: '#d33',
    		  confirmButtonText: 'Si, eliminar'
    		}).then((result) => {
    		  if (result.value) {
    			  
    		    swal(
    		      'Eliminado!',
    		      'Su producto fue eliminado',
    		      'success'
    		    )
    		    location.href ="EliminarDetalle?id="+codigo+"&cant="+c;
    		  }
    		})

    	

    }
    
    function llamarServletOrdenar(){
    	var total=document.getElementById("")
    	 var nomDel=document.getElementById("nomDel").value;
    	 var dniDel=document.getElementById("dniDel").value;
    	 var dir=document.getElementById("dir").value;
    	 var pagoDel=document.getElementById("pagoDel").value;
    	 var obsDel=document.getElementById("obsDel").value;
    	
    	swal({
    		  title: 'Esta Seguro que desea ordenar el pedido?',
    		  text: "Ya no podra modificar su pedido",
    		  type: 'warning',
    		  showCancelButton: true,
    		  confirmButtonColor: '#3085d6',
    		  cancelButtonColor: '#d33',
    		  confirmButtonText: 'Si, tengo hambre!!!'
    		}).then((result) => {
    		  if (result.value) {
    			  
    		    swal(
    		      'Ordenado!',
    		      'Su pedido se encuentra en camino',
    		      'success'
    		    )
    		    location.href ="RealizarOrden?nomDel="+nomDel+"&dniDel="+dniDel+"&dir="+dir+"&pagoDel="+pagoDel+"&obsDel="+obsDel;
    		  }
    		})

    	

    }
    </script>
</body>
</html>