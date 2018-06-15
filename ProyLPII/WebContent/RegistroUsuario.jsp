<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="beans.TipoUsuarioDTO" %>
<%@page import="service.UsuarioService" %>
<%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <title>Urpinion â€” Form</title>
  <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
	<link rel="stylesheet" href="scss/styleReg.scss">
	  <link rel="stylesheet" href="css/styleReg.css">

</head>

<body>

  <div class="container" >
  <h1>SIRVETEK</h1>
  <h2>REGISTRO DE USUARIO</h2>
  <form class="form" action="RegistrarUsuario">
    
  <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="nom_Usu" name="nom_Usu" tabindex="0" />
      <label for="nom_Usu">
        <span data-text="Nombre">Nombre</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="apePat_Usu" name="apePat_Usu" tabindex="0" />
      <label for="username">
        <span data-text="Apellido Paterno">Apellido Paterno</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="apeMat_Usu" name="apeMat_Usu" tabindex="0" />
      <label for="username">
        <span data-text="Apellido Materno">Apellido Materno</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="dni_Usu" name="dni_Usu" tabindex="0" />
      <label for="username">
        <span data-text="DNI de Usuario">DNI de Usuario</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="telf_Usu" name="telf_Usu" tabindex="0" />
      <label for="username">
        <span data-text="Telefono de Usuario">Telefono de Usuario</span>
      </label>
    </fieldset>
    
      <div class="caja"><select name="Id_TipoUsu">
       <option>Elija un tipo de Usuario</option>
      <% 
      UsuarioService us = new UsuarioService();
      List<TipoUsuarioDTO> lista = us.listarTipoUsuario(); 
     if(lista!=null){
      for (TipoUsuarioDTO t: lista){
      %>
      <option value="<%=t.getCodigo()%>"><%=t.getDescripcion()%></option></select><%}}else{System.out.print("no hay na");}%></div>
  

    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="usuario" name="usuario" tabindex="0" />
      <label for="username">
        <span data-text="Username">Username</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __third">
      <input type="password" id="contraseña" name="contraseña" />
      <label for="new-password">
        <span data-text="Contraseña">Contraseña</span>
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