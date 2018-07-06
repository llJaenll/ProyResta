<%@page import="beans.UsuarioDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	UsuarioDTO u = (UsuarioDTO) request.getSession().getAttribute("usu");
	if (u == null) {
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Panel Administrativo</title>
</head>
<body>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/MenuEstilo.css">
	<script src="js/Menu.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<div id="wrapper">
		<div class="overlay"></div>

		<!-- Sidebar -->
		<nav class="navbar navbar-inverse navbar-fixed-top"
			id="sidebar-wrapper" role="navigation">
			<ul class="nav sidebar-nav">
				<li class="sidebar-brand"><a href="#">Sirvetek </a></li>
				<!--  <li><a href="#">Mi Perfil</a></li>-->
				<!-- <li>
                    <a href="Graficos.jsp" target="form">Graficos</a>
                </li> -->
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Mantenimiento <span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li class="dropdown-header">Lista Mantenimientos</li>
						<li><a href="ListaUsuario.jsp" target="form">Mantenimiento
								Usuarios</a></li>
						<li><a href="ListaProducto.jsp" target="form">Mantenimiento
								Productos</a></li>
					</ul></li>
				<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Reportes
						<span class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
						<li class="dropdown-header">Lista de Reportes</li>
						<li><a href="ReportesProductos.jsp" target="form">Reporte
								Productos</a></li>
						<li><a href="ReporteVentas.jsp" target="form">Reporte
								Ventas</a></li>
					</ul></li>
				<li><a href="CerrarSesion">Cerrar Sesion</a></li>
			</ul>
		</nav>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">
			<button type="button" class="hamburger is-closed"
				data-toggle="offcanvas" id="cambio">
				<span class="hamb-top"></span> <span class="hamb-middle"></span> <span
					class="hamb-bottom"></span>
			</button>
			<div class="container">
				<iframe
					style="width: 100%; height: 700px; border: 0; margin-top: -80px"
					name="form"></iframe>
			</div>
		</div>
		<!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->
</body>
</html>


