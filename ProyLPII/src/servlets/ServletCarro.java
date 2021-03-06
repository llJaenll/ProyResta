package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DetalleDeliveryDTO;
import beans.ProductoDTO;
import service.DeliveryService;
import service.ProductoService;

/**
 * Servlet implementation class ServletCarro
 */
@WebServlet("/ServletCarro")
public class ServletCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DeliveryService ds = new DeliveryService();
		// TODO Auto-generated method stub
		// capturamos los datos del formulario de Compra
		int cantidad = Integer.parseInt(request.getParameter("cant"));
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("cant" + cantidad + " id" + id);
		// se captura el producto enviado al formulario
		ProductoService ps = new ProductoService();
		ProductoDTO p = ps.buscarProductoCod(id);

		int idprod = p.getCodigo();
		String descripcion = p.getDescripcion();
		double preciovta = p.getPrecio();
		System.out.println("pre" + p.getPrecio());
		// obtenemos los datos globales de session
		ArrayList<DetalleDeliveryDTO> carroD = (ArrayList<DetalleDeliveryDTO>) request.getSession()
				.getAttribute("carroD");
		double totalventa = (double) request.getSession().getAttribute("totalventa");

		// se agrega el sweet ale
		PrintWriter out = response.getWriter();

		// agregamos el producto y actualizamos el total
		try {
			DetalleDeliveryDTO v = new DetalleDeliveryDTO();
			v.setidDelivery(ds.codigoCorrelativo());
			v.setIdProducto(idprod);
			v.setPrecioProducto(preciovta);
			v.setSubtotal(cantidad * preciovta);
			v.setCantidad(cantidad);
			totalventa += (cantidad * preciovta);
			carroD.add(v);
			out.print(
					"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.print("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.print("<script>");
			out.print("$(document).ready(function(){");
			out.print("swal('Ok','Pedido Agregado correctamente','success');");
			out.print("});");
			out.print("</script>");
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}

		request.getSession().setAttribute("carroD", carroD);
		request.getSession().setAttribute("totalventa", totalventa);

		// visualiza el jsp
		request.getRequestDispatcher("Resumen.jsp").include(request, response);

	}

}
