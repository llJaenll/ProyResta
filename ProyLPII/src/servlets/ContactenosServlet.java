package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ContactenosDTO;
import service.ContactenosService;

/**
 * Servlet implementation class ContactenosServlet
 */
@WebServlet("/ContactenosServlet")
public class ContactenosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String nombre_contactenos;
		 String correo_contactenos;
		 String telefono_contactenos ;
		 String mensaje_contactenos;
		 PrintWriter out=response.getWriter();
		nombre_contactenos = request.getParameter("nombre");
		correo_contactenos = request.getParameter("correo");
		telefono_contactenos = request.getParameter("telefono");
		mensaje_contactenos = request.getParameter("mensaje");
		
		ContactenosDTO cn = new ContactenosDTO();
		cn.setNombre_contactenos(nombre_contactenos);
		cn.setCorreo_contactenos(correo_contactenos);
		cn.setTelefono_contactenos(telefono_contactenos);
		cn.setMensaje_contactenos(mensaje_contactenos);
		
		ContactenosService cs = new ContactenosService();
		int reg = cs.registrar(cn);
		
		if( reg != 0) {
			out.print("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.print("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.print("<script>");
			out.print("$(document).ready(function(){");
			out.print("swal('Ok','Contacto Exitoso','success');");
			out.print("});");
			out.print("</script>");
			request.setAttribute("mensaje","REGISTRADO");
			request.getRequestDispatcher("/Contactenos.jsp").include(request, response);
		}else {
			request.setAttribute("mensaje","ERROR");
			request.getRequestDispatcher("/Contactenos.jsp").include(request, response);
		 }
 }
}
