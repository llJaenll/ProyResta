<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="css/estiloResumen.css">
</head>
<body>
<section class="products">
	
	<section class="products__header">
		<h1>Resumen de Pedido</h1>
		<p>Total S/150</p>
		<input type="submit" value="Ordenar">
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
	
</body>
</html>