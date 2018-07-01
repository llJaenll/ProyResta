package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DeliveryDTO;
import beans.DetalleDeliveryDTO;
import service.DeliveryService;
import service.DetalleDeliveryService;
import service.ProductoService;

/**
 * Servlet implementation class RealizarOrden
 */
@WebServlet("/RealizarOrden")
public class RealizarOrden extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//obtenemos el codigo correlativo
					DeliveryService des= new DeliveryService();
					int codDel=des.codigoCorrelativo();
			
			DeliveryDTO d = new DeliveryDTO();
			d.setIdDelivery(codDel);
			d.setId_motor(1);
			d.setDir(request.getParameter("dir"));
			d.setNomDel(request.getParameter("nomDel"));
			d.setDniDel(request.getParameter("dniDel"));
			d.setPagoDel(request.getParameter("pagoDel"));
			d.setObsDel(request.getParameter("obsDel"));
			des.registrarDelivery(d);
			//hasta aqui es delivery
			
			DetalleDeliveryService ds = new DetalleDeliveryService();
			DetalleDeliveryDTO dto = new DetalleDeliveryDTO();
			
			ArrayList<DetalleDeliveryDTO> carroD = (ArrayList<DetalleDeliveryDTO>)request.getSession().getAttribute("carroD");
			for (DetalleDeliveryDTO dt : carroD) {
				ds.registrar(dt);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error "+e.getMessage());
		}
		
		
	}

}
