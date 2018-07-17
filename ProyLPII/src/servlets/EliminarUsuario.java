package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import service.UsuarioService;

/**
 * Servlet implementation class EliminarUsuario
 */
@WebServlet("/EliminarUsuario")
public class EliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			String accion =request.getParameter("action");
			int idusuario = Integer.parseInt(request.getParameter("idUsuario"));
			
			UsuarioService us = new UsuarioService();
			
			if(accion.equals("eliminar")) {
			
				int ok = us.eliminar(idusuario);
				
				if(ok>0) {
					out.print("Usuario Eliminado");
				}else {
					out.print("Usuario no se pudo eliminar");
				}
				
				
			}
			
			
		}catch (Exception e) {
			out.println(e.getMessage());
		}finally {
			out.close();
		}
		
		
	}

}
