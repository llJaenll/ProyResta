package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DetalleDeliveryDTO;

/**
 * Servlet implementation class EliminarDetalle
 */
@WebServlet("/EliminarDetalle")
public class EliminarDetalle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		ArrayList<DetalleDeliveryDTO> carroD = (ArrayList<DetalleDeliveryDTO>)request.getSession().getAttribute("carroD");
		
		carroD.remove(carroD.get(id-1));
		
		request.getSession().setAttribute("carroD", carroD);
		
		//visualiza el jsp
				request.getRequestDispatcher("Resumen.jsp").forward(request, response);
		
		
		
	}

}
