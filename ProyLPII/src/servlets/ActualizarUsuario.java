package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UsuarioDTO;
import service.UsuarioService;

/**
 * Servlet implementation class ActualizarUsuario
 */
@WebServlet("/ActualizarUsuario")
public class ActualizarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idUsuario =Integer.parseInt(request.getParameter("idUsuario"));
		
		UsuarioService us = new UsuarioService();
		
		UsuarioDTO u = us.buscarUsuario(idUsuario);
		
		request.setAttribute("data", u);
		
		System.out.println(""+u.getApePat());
		
		request.getRequestDispatcher("/ActualizacionUsuario.jsp").forward(request, response);		
		
	}

}
