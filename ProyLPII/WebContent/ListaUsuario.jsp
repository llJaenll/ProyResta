<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Usuarios</title>
</head>
<script defer src="https://use.fontawesome.com/releases/v5.0.13/js/all.js" integrity="sha384-xymdQtn1n3lH2wcu0qhcdaOpQwyoarkgLVxC/wZ5q7h9gHtxICrpcaSUfygqZGOe" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0/css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.1/css/responsive.bootstrap4.min.css">
<style>
#ListTit{
	margin-top: 3%;
}
#ListBot{
	margin-top: 0.5%;
	margin-left:1%;
	margin-bottom: 1%;
}
</style>
<body>
<div class="container">
<h1 id="ListTit">Lista de Productos</h1>
<a  id="ListBot" type="button" class="btn btn-info btn-xs" href="RegistroUsuario.jsp">Añadir</a>
<h1>Lista de Usuarios</h1>
<table id="tablaClientes" class="table table-striped table-bordered dt-responsive nowrap" style="width:100%">
        <thead>
            <tr>
                <th>Nombre</th>
                <th>DNI</th>
                <th>Teléfono</th>
                <th>Tipo de Usuario</th>
                <th>Usuario</th>
                <th>Fecha de Ingreso</th>
                <th>Acciones</th>    
            </tr>
        </thead>
        <tbody>
       
       
       
        </tbody>
        <tfoot>
            <tr>
                <th>Nombre</th>
                <th>DNI</th>
                <th>Teléfono</th>
                <th>Tipo de Usuario</th>
                <th>Usuario</th>
                <th>Fecha de Ingreso</th>  
                <th>Acciones</th>
            </tr>
        </tfoot>
    </table>
	
</div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.datatables.net/responsive/2.2.1/js/dataTables.responsive.min.js"></script>
<script src="https://cdn.datatables.net/responsive/2.2.1/js/responsive.bootstrap4.min.js"></script>

<script>
$(document).ready(function() {

    var tabla = $('#tablaClientes').DataTable({
        ajax:{
        	method:"POST",
        	url:"Listar",
        	dataSrc:"datos"
        },
        columns: [ 
        	{"data":"nom_Usu"}, 
        	{"data":"dni_Usu"},
        	{"data":"telf_Usu"},
        	{"data":"Id_TipoUsu"},
        	{"data":"usuario"},
        	{"data":"fechIng_Usu"},
        	{"data":"acciones"}
        ],
        
    	"language": {
            "url": "//cdn.datatables.net/plug-ins/1.10.16/i18n/Spanish.json"
        }
    
    
    } );
    
    $(document).on('click','.eliminar',function(){
    	
    	var idUsuario = $(this).attr('id');
    	var row = $(this).parent().parent();
    	var r = confirm("¿Seguro que desea eliminar al cliente?");
    	
    	if (r==true) {
			
    		$.ajax({
    			
    			url:"EliminarUsuario",
    			method:"POST",
    			data:{"action":"eliminar","idUsuario":idUsuario},
    			success: function(data){
    				alert("El usuario fue eliminado");
    				row.remove();
    			},
    			error: function (error){
    				alert("Error al ejecutar el procedimiento");
    			}
    			
    			
    			
    		});
    		
    		
    		
		}
    	    	
    });
    
 
    
    
    
    
});
</script>
	
</body>
</html>