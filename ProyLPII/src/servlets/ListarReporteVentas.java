package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import beans.DetalleDeliveryDTO;
import service.DetalleDeliveryService;

/**
 * Servlet implementation class Listar
 */
@WebServlet("/ListarReporteV")
public class ListarReporteVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String fecha1 = request.getParameter("fecha1");
		String fecha2 = request.getParameter("fecha2");

		DetalleDeliveryService ds = new DetalleDeliveryService();
		List<DetalleDeliveryDTO> lista = ds.listarOrdenado(fecha1, fecha2);
		String datos = "";

		com.google.gson.JsonObject gson = new JsonObject();
		JsonArray array = new JsonArray();

		for (DetalleDeliveryDTO d : lista) {
			JsonObject item = new JsonObject();
			item.addProperty("descripcion", d.getNombre());
			item.addProperty("precio", d.getPrecioProducto());
			item.addProperty("cantidad", d.getCantidad());
			item.addProperty("subtotal", d.getSubtotal());
			array.add(item);
		}

		gson.add("datos", array);
		out.println(gson.toString());

	}

}
