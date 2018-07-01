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
	<link rel="stylesheet" href="css/estiloResumen.css">
	<link rel="stylesheet" href="css/BarraMenu.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Dancing+Script|Poiret+One" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
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
<section class="products">

	<%
	ArrayList<DetalleDeliveryDTO> carro = (ArrayList<DetalleDeliveryDTO>)request.getSession().getAttribute("carroD");
	Double totalventa=(Double)request.getSession().getAttribute("totalventa");
	%>	
	<section class="products__header">
	<form action="RealizarOrden">
		<h1>Resumen de Pedido</h1>
		<p>Total S/<%=totalventa%> </p>
		<input type="button" value="Ordenar" id="btordenar" data-toggle="modal" data-target="#exampleModal"> 
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
						<input type="text" class="form-control" id="nombre">
					  </div>
					   <div class="form-group">
						<label for="nombre" class="col-form-label">DNI:</label>
						<input type="text" class="form-control" id="nombre">
					  </div> 
					  <div class="form-group">
						<label for="nombre" class="col-form-label" required>Direccion:</label>
						<input type="text" class="form-control" id="nombre">
					  </div> 
					  <div class="form-group">
						<label for="nombre" class="col-form-label" required>Direccion:</label>
						 <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
							<option selected>Tipo de Pago</option>
							<option value="1">Efectivo</option>
							<option value="2">Tarjeta</option>
						  </select>
					  </div>
					  <div class="form-group">
						<label for="message-text" class="col-form-label">Observaciones para el pedido:</label>
						<textarea class="form-control" id="message-text"></textarea>
					  </div>
					   <div class="form-group">
						<div class="alert alert-primary" role="alert">
						  	<center><p>Total de su pedido S/500</p></center>
						</div>
					  </div>
					</form>
				  </div>
				  <div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
					<button type="sumbit" class="btn btn-primary">Ordenar</button>
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
			<img src='img/<%=dt.getIdProducto() %>.jpg'  class="product-img">
			<section class="product-desc" >
				<h3>Nombre: <%=p.getDescripcion() %></h3>
				<h3>Precio : S/<%=dt.getPrecioProducto() %></h3>				
				<h3>Cantidad : <%=dt.getCantidad() %></h3>				
				<h3>Subtotal : S/<%=dt.getSubtotal() %></h3>				
			</section>
			<div class="wrap-item-button"><a href="EliminarDetalle?id=<%=p.getCodigo()%>&cant=<%=dt.getCantidad()%>" class="item-button">Eliminar</a></div>

		</article>

	</section>
	<%} %>
	
</section>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script type="application/ecmascript" src="js/BarraMenu.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
</body>
</html>