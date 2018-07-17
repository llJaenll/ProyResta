package servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 * Servlet implementation class RealizarOrden
 */
@WebServlet("/RealizarOrden")
public class RealizarOrden extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			PrintWriter out = response.getWriter();
			// obtenemos el codigo correlativo
			DeliveryService des = new DeliveryService();
			int codDel = des.codigoCorrelativo();

			DeliveryDTO d = new DeliveryDTO();
			d.setIdDelivery(codDel);
			d.setId_motor(1);
			d.setDir(request.getParameter("dir"));
			d.setNomDel(request.getParameter("nomDel"));
			d.setDniDel(request.getParameter("dniDel"));
			d.setPagoDel(request.getParameter("pagoDel"));
			d.setObsDel(request.getParameter("obsDel"));
			des.registrarDelivery(d);
			// hasta aqui es delivery

			DetalleDeliveryService ds = new DetalleDeliveryService();
			DetalleDeliveryDTO dto = new DetalleDeliveryDTO();

			ArrayList<DetalleDeliveryDTO> carroD = (ArrayList<DetalleDeliveryDTO>) request.getSession()
					.getAttribute("carroD");
			for (DetalleDeliveryDTO dt : carroD) {
				ds.registrar(dt);
			}
			ArrayList<DetalleDeliveryDTO> carroLimpio = (ArrayList<DetalleDeliveryDTO>) request.getSession()
					.getAttribute("carroD");
			Double totalLimpio = 0.0;
			request.getSession().setAttribute("carroD", carroLimpio);
			request.getSession().setAttribute("totalventa", totalLimpio);
			out.println("<script>");
			out.println(
					"open(\"MapaEmergente.jsp\",\"Mapa Guia\",\"width=800,heigth=300,left=100,top=10,scrollbars=no,toolbars=no\");");
			out.println("</script>");
			out.print(
					"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.print("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.print("<script>");
			out.print("$(document).ready(function(){");
			out.print("swal('Ok','Su pedido se encuentra en camino','success');");
			out.print("});");
			out.print("</script>");
			request.getRequestDispatcher("/PrincipalIndex.jsp").include(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e.getMessage());
		}

	}

}