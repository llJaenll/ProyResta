package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ProductoDTO;
import beans.UsuarioDTO;
import service.ProductoService;
import service.UsuarioService;

/**
 * Servlet implementation class ActualizarUsuario
 */
@WebServlet("/ActualizarProducto")
public class ActualizarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idProducto =Integer.parseInt(request.getParameter("id"));
		
		ProductoService ps = new ProductoService();
		
		ProductoDTO p = ps.buscarProductoCod(idProducto);
		
		request.setAttribute("data", p);
		
		request.getRequestDispatcher("/ActualizacionProducto.jsp").forward(request, response);		
		
	}

}
