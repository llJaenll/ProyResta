package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;

import service.ProductoService;
import service.UsuarioService;

/**
 * Servlet implementation class EliminarUsuario
 */
@WebServlet("/EliminarProducto")
public class EliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			String accion =request.getParameter("action");
			int idProducto = Integer.parseInt(request.getParameter("idProducto"));
			
			ProductoService ps = new ProductoService();
			
			if(accion.equals("eliminar")) {
			
				int ok = ps.eliminar(idProducto);
				
				if(ok>0) {
					out.print("Producto Eliminado");
				}else {
					out.print("Producto no se pudo eliminar");
				}
				
				
			}
			
			
		}catch (Exception e) {
			out.println(e.getMessage());
		}finally {
			out.close();
		}
		
		
	}

}
