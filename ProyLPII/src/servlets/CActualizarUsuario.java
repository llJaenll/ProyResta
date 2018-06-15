package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UsuarioDTO;
import service.UsuarioService;

/**
 * Servlet implementation class CActualizarUsuario
 */
@WebServlet("/CActualizarUsuario")
public class CActualizarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
		
		UsuarioDTO u = new UsuarioDTO(Integer.parseInt(request.getParameter("Id_Usu")), request.getParameter("nom_Usu"), request.getParameter("apePat_Usu"),
				request.getParameter("apeMat_Usu"), request.getParameter("telf_Usu"),
				null, request.getParameter("dni_Usu"), request.getParameter("usuario"), request.getParameter("contraseña"), 
				Integer.parseInt(request.getParameter("Id_TipoUsu")));
		
		UsuarioService us = new UsuarioService();
		int ok = us.modificar(u);
		
		if (ok==0) {
			out.println("Error");
		} else {
			out.println("Se modifico");
		}
	}

}
