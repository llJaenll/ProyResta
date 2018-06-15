<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="beans.UsuarioDTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <title>Urpinion â€” Form</title>
  <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
	<link rel="stylesheet" href="css/styleReg.css">
	<link rel="stylesheet" href="scss/styleReg.scss">

    <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>

</head>

<body>
  <div class="container" >
  <h1>SIRVETEK</h1>
  <h2>EDICION DE USUARIO</h2>
  <% UsuarioDTO u = (UsuarioDTO) request.getAttribute("data"); %>
  <form class="form" action="RegistrarUsuario">
  
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="Id_Usu" name="Id_Usu" tabindex="0" value="<%= u.getCodigo() %>"/>
      <label for="nom_Usu">
        <span data-text="Codigo">Codigo</span>
      </label>
    </fieldset>
    
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
    
      <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="Id_TipoUsu" name="Id_TipoUsu" tabindex="0" />
      <label for="username">
        <span data-text="Tipo de Usuario">Tipo de Usuario</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __first">
      <input type="text" id="usuario" name="usuario" tabindex="0" />
      <label for="username">
        <span data-text="Username">Username</span>
      </label>
    </fieldset>
    
    <fieldset class="form-fieldset ui-input __third">
      <input type="password" id="contraseÃ±a" name="contraseÃ±a" />
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