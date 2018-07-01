<%@page import="beans.CategoriaDTO"%>
<%@page import="java.util.List"%>
<%@page import="service.CategoriaService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Menu</title>
	<link rel="stylesheet" href="css/estilogaleria.css">
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
	<div class="content-all">
		<%
			CategoriaService cs = new CategoriaService();
			List<CategoriaDTO> listaCat=cs.listarCategoria();
			for(CategoriaDTO c:listaCat){
		%>
		<div class="content-img">
			<img src="img/categoria/<%=c.getCodigo() %>.jpg">
			<div class="content-txt">
				<h2><%=c.getDescripcion() %></h2>
				<a href="GaleriaProd.jsp?cod=<%=c.getCodigo()%>"><input type="button" value="Ir"></a>
			</div>
			<div class="content-1"></div>
			<div class="content-2"></div>
			<div class="content-3"></div>
			<div class="content-4"></div>
			
		</div>
		
		<%
			}
		%>
	</div>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script type="application/ecmascript" src="js/BarraMenu.js"></script>
</body>
</html>