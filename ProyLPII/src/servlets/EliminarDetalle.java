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
<<<<<<< HEAD
			if(cont==0) {
				if(det.getIdProducto()!=id && det.getCantidad()!=cant) {				
					listaTemp.add(det);
				}else {
					cont++;
				}	
=======
			if(det.getIdProducto()==id && det.getCantidad()==cant) {
				
				cont++;
>>>>>>> f73049c6db9f5d7a2cf13c051a759a2c48538e76
			}else {
				listaTemp.add(det);
			}
			
<<<<<<< HEAD
			cont2++;
		}
		
		request.getSession().setAttribute("carroD", listaTemp);
		request.getRequestDispatcher("/Resumen.jsp").forward(request, response);		
=======
		}
		carroD.remove(carroD.get(id-1));
		
		request.getSession().setAttribute("carroD", carroD);
		
		//visualiza el jsp
				request.getRequestDispatcher("Resumen.jsp").forward(request, response);
>>>>>>> f73049c6db9f5d7a2cf13c051a759a2c48538e76
		
		
		
	}

}
