<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Reporte de Ventas</title>
</head>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/all.js"
	integrity="sha384-xymdQtn1n3lH2wcu0qhcdaOpQwyoarkgLVxC/wZ5q7h9gHtxICrpcaSUfygqZGOe"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0/css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/responsive/2.2.1/css/responsive.bootstrap4.min.css">

<style>
#ListTit {
	margin-top: 3%;
}

#ListBot {
	margin-top: 0.5%;
	margin-left: 1%;
	margin-bottom: 2%;
}
</style>
<body>
	<div class="container">
		<h1 id="ListTit">Reporte de Ventas</h1>

		<div id="ListBot" class="input-group">
			<div class="input-group-prepend">
				<span class="input-group-text" id="">Ingrese Fechas a Filtrar</span>
			</div>
			<input id="fecha1" width="276" readonly /> <input id="fecha2"
				width="276" readonly />
			<div class="wrap-item-button">
				<a type="button" id="llamar" class="btn btn-primary">Filtrar</a>
			</div>

		</div>

		<table id="tablaProductos"
			class="table table-striped table-bordered dt-responsive nowrap"
			style="width: 100%">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Precio</th>
					<th>Cantidad</th>
					<th>Subtotal</th>
				</tr>
			</thead>
			<tbody>



			</tbody>
			<tfoot>
				<tr>
					<th>Nombre</th>
					<th>Precio</th>
					<th>Cantidad</th>
					<th>Subtotal</th>
				</tr>
			</tfoot>
		</table>

	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
		integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
		integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
		crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>
	<script
		src="https://cdn.datatables.net/responsive/2.2.1/js/dataTables.responsive.min.js"></script>
	<script
		src="https://cdn.datatables.net/responsive/2.2.1/js/responsive.bootstrap4.min.js"></script>

	<script>
		$(document)
				.ready(
						function() {

							$('#fecha1').datepicker({
								uiLibrary : 'bootstrap4',
								format : 'yyyy-mm-dd'
							});

							$('#fecha2').datepicker({
								uiLibrary : 'bootstrap4',
								format : 'yyyy-mm-dd'
							});

							$(document)
									.on(
											'click',
											'#llamar',
											function() {

												var fecha1 = document
														.getElementById("fecha1").value;
												var fecha2 = document
														.getElementById("fecha2").value;

												var tabla = $('#tablaProductos')
														.DataTable(
																{
																	ajax : {
																		method : "POST",
																		url : "ListarReporteV?fecha1="
																				+ fecha1
																				+ "&fecha2="
																				+ fecha2,
																		dataSrc : "datos"
																	},
																	columns : [
																			{
																				"data" : "descripcion"
																			},
																			{
																				"data" : "cantidad"
																			},
																			{
																				"data" : "precio"
																			},
																			{
																				"data" : "subtotal"
																			} ],
																	dom : 'Bfrtip',
																	buttons : [
																			'copy',
																			'csv',
																			'excel',
																			'pdf',
																			'print' ],

																	"language" : {
																		"url" : "//cdn.datatables.net/plug-ins/1.10.16/i18n/Spanish.json"
																	},
																	destroy : true

																});

											});

						});
	</script>
	<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.6/js/gijgo.min.js"
		type="text/javascript"></script>
	<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.6/css/gijgo.min.css"
		rel="stylesheet" type="text/css" />

	<script
		src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js"
		type="text/javascript"></script>
	<script src="dn.datatables.net/buttons/1.5.2/js/buttons.flash.min.js"
		type="text/javascript"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"
		type="text/javascript"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"
		type="text/javascript"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"
		type="text/javascript"></script>
	<script
		src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js"
		type="text/javascript"></script>
	<script
		src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js"
		type="text/javascript"></script>
</body>
</html>