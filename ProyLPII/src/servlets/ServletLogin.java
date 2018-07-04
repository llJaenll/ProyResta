package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UsuarioDTO;
import service.UsuarioService;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//variables
				
				String usuario,clave;
				PrintWriter out = response.getWriter();
				//entradas
			
				usuario = request.getParameter("usuario");
				clave= request.getParameter("password");
				
				//procesos
				
				UsuarioService service = new UsuarioService();
				UsuarioDTO u = service.validarUsuario(usuario, clave);
				
				//salidas
				
				if(u!=null) {
					out.print("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
					out.print("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
					out.print("<script>");
					out.print("$(document).ready(function(){");
					out.print("swal('Ok','Bienvenido','success');");
					out.print("});");
					out.print("</script>");
					//éxito
					
					request.setAttribute("msj", "ok");
					request.getRequestDispatcher("/IndexAdministracion.jsp").forward(request, response);
					
				}else {
					out.print("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
					out.print("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
					out.print("<script>");
					out.print("$(document).ready(function(){");
					out.print("swal('Error','Contraseña o Usuario Incorrecto','error');");
					out.print("alert('holas')");
					out.print("});");
					out.print("</script>");
					System.out.println("entro");
					request.setAttribute("msj", "Usuario/Contraseña Incorrectos");
					request.getRequestDispatcher("/Login.jsp").include(request, response);
					
					
					
				}
		
		
	}

}
