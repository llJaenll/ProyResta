<%@page import="beans.CategoriaDTO"%>
<%@page import="service.ProductoService"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="beans.TipoUsuarioDTO"%>
<%@page import="service.UsuarioService"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" http-equiv="Content-Type" content="text/html">
<title>Registro de Producto</title>
<meta name="viewport" content="width=device-width">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
<link rel="stylesheet" href="scss/styleReg.scss">
<link rel="stylesheet" href="css/styleReg.css">

</head>

<body>

	<div class="container">
		<h1>SIRVETEK</h1>
		<h2>REGISTRO DE PRODUCTO</h2>
		<form method="post" enctype="multipart/form-data" class="form"
			action="RegistrarProducto">

			<div class="caja">
				<select name="Id_TipoCat" id="Id_TipoCat" required>
					<option value="">Elija un tipo de Producto</option>
					<%
						ProductoService up = new ProductoService();
						List<CategoriaDTO> lista = up.listarTipoProducto();
						if (lista != null) {
							for (CategoriaDTO t : lista) {
					%>
					<option value="<%=t.getCodigo()%>"><%=t.getDescripcion()%></option>
					<%
						}
						} else {
							System.out.print("no hay na");
						}
					%>
				</select>
			</div>


			<fieldset class="form-fieldset ui-input __first">
				<input type="text" id="nom_Prod" name="nom_Prod" tabindex="0"
					maxlength="10" pattern="[A-Za-z]{2,40}"
					title="Introduce entre 3 y 40 letras" required /> <label
					for="nom_Prod"> <span data-text="Descripcion">Descripcion</span>
				</label>
			</fieldset>

			<fieldset class="form-fieldset ui-input __first">
				<input type="text" id="precio_Prod" name="precio_Prod" tabindex="0"
					maxlength="6" pattern="[0-9]{1,6}"
					title="Introduce un precio correcto" required /> <label
					for="precio_Prod"> <span data-text="Precio">Precio</span>
				</label>
			</fieldset>

			<fieldset class="form-fieldset ui-input __first">
				<input type="text" id="stock_Prod" name="stock_Prod" tabindex="0"
					maxlength="3" pattern="[0-9]{1,3}"
					title="Introduce un stock correcto" required /> <label
					for="stock_Prod"> <span data-text="Stock de Producto">Stock
						de Producto</span>
				</label>
			</fieldset>

			<fieldset class="form-fieldset ui-input __first">
				<input type="file" id="file" name="file" tabindex="0" required /> <label
					for="stock_Prod"> <span data-text="Seleccione una imagen">Seleccione
						una imagen</span>
				</label>
			</fieldset>

			<div class="form-footer">
				<button type="submit" class="btn">REGISTRAR</button>
				<a id="ListBot" type="button" class="btn btn-info btn-xs"
					href="ListaProducto.jsp">Volver</a>
			</div>
			<label id="confirm">${msgR}</label>
		</form>
	</div>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>



	<script src="js/indexReg.js"></script>




</body>
</html>