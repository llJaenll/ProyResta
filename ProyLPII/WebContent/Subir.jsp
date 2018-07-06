<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Seleccionar Archivo</title>
</head>
<body>
	<form action="SubirServlet" method="post" enctype="multipart/form-data">
		<input type="file" name="file"> <input type="submit"
			value="subir">
	</form>
</body>
</html>