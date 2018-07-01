<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="beans.ProductoDTO" %>
<%@page import="beans.CategoriaDTO" %>
<%@page import="service.ProductoService" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Urpinion — Form</title>
  <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
	<link rel="stylesheet" href="css/styleReg.css">
	<link rel="stylesheet" href="scss/styleReg.scss">

    <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>

</head>

<body>
  <div class="container" >
  <h1>SIRVETEK</h1>
  <h2>EDICION DE PRODUCTO</h2>
    <% ProductoDTO p = (ProductoDTO) request.getAttribute("data"); %>
 <form method="post" enctype="multipart/form-data" class="form" action="CActualizarProducto" >
    
     <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="codigo" readonly="true" name="codigo" tabindex="0" value="<%= p.getCodigo() %>"/>
      <label for="nom_Usu">
        <span data-text="Codigo">Codigo</span>
      </label>
    </fieldset>
    
      <div class="caja"><select name="Id_TipoCat" id ="Id_TipoCat">
       <option>Elija un tipo de Producto</option>
      <% 
      ProductoService up = new ProductoService();
      List<CategoriaDTO> lista = up.listarTipoProducto(); 
     if(lista!=null){
      for (CategoriaDTO t: lista){
      %>
      <option value="<%=t.getCodigo()%>"><%=t.getDescripcion()%></option><%}}else{System.out.print("no hay na");}%></select></div>

    
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="nom_Prod" name="nom_Prod" tabindex="0" value="<%= p.getDescripcion() %>"/>
      <label for="nom_Prod">
        <span data-text="Descripcion">Descripcion</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="precio_Prod" name="precio_Prod" tabindex="0" value="<%= p.getPrecio() %>"/>
      <label for="precio_Prod">
        <span data-text="Precio">Precio</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="stock_Prod" name="stock_Prod" tabindex="0" value="<%= p.getStock() %>"/>
      <label for="stock_Prod">
        <span data-text="Stock de Producto">Stock de Producto</span>
      </label>
    </fieldset>
    
       <fieldset class="form-fieldset ui-input __first">
      <input type="file" id="file" name="file" tabindex="0" />
      <label for="stock_Prod">
        <span data-text="Seleccione una imagen">Seleccione una imagen</span>
      </label>
    </fieldset>

    <div class="form-footer">
      <button type="submit" class="btn">Crear cuenta</button>
    </div>
  </form>
</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  

    <script  src="js/index.js"></script>





</body>
</html>