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
		int cant=Integer.parseInt(request.getParameter("cant"));
		int cont=0;
		int cont2=0;
		ArrayList<DetalleDeliveryDTO> listaTemp=new ArrayList<>();
		ArrayList<DetalleDeliveryDTO> carroD = (ArrayList<DetalleDeliveryDTO>)request.getSession().getAttribute("carroD");
		for(DetalleDeliveryDTO det:carroD) {
			if(cont==0) {
				if(det.getIdProducto()!=id && det.getCantidad()!=cant) {				
					listaTemp.add(det);
				}else {
					cont++;
				}	
			}else {
				listaTemp.add(det);
			}
			
			cont2++;
		}
		
		request.getSession().setAttribute("carroD", listaTemp);
		request.getRequestDispatcher("/Resumen.jsp").forward(request, response);		
		
		
		
	}

}
