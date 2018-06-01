<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Administracion</title>

    <!-- Bootstrap core CSS -->
    <link href="util/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/simple-sidebar.css" rel="stylesheet">

</head>

<body>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        Restaurant Jaen
                    </a>
                </li>
                <li>
                    <a href="Graficos.jsp" target="form" class="link1">Administracion</a>
                </li>
                <li>
                    <a href="ListaUsuario.jsp" target="form" class="link1">Usuario</a>
                </li>
                <li>
                    <a href="#">Overview</a>
                </li>
                <li>
                    <a href="#">Events</a>
                </li>
                <li>
                    <a href="#">About</a>
                </li>
                <li>
                    <a href="#">Services</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->
       
       
        <!-- Page Content -->
<!--        <div>
        	 <img src="" alt="">
        </div>-->
		<div class="container-fluid">              
			<a href="#menu-toggle" class="btn btn-secondary" id="menu-toggle">Ver Menu</a>
		</div>
        <div id="page-content-wrapper">
            <iframe  style="width: 100%; height: 500px;border: 0" name="form"></iframe> 
        </div>

    </div>
    <!-- /#wrapper -->

    <!-- Bootstrap core JavaScript -->
    <script src="util/jquery/jquery.min.js"></script>
    <script src="util/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Menu Toggle Script -->
    <script>
		var cont=0;
    $("#menu-toggle").click(function(e) {
		if(cont==0){
			cont++;
			e.preventDefault();
        	$("#wrapper").toggleClass("toggled");
			$(this).html('Ocultar');
		}else{
			cont=0;
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
			$(this).html('Ver Menu');
		}
	
    });

    </script>

</body>

</html>

