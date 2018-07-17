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

import beans.ProductoDTO;
import service.ProductoService;

/**
 * Servlet implementation class Listar
 */
@WebServlet("/ListarReporteP")
public class ListarReporteP extends HttpServlet {
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

		ProductoService ps = new ProductoService();
		List<ProductoDTO> lista = ps.listarProdMasVendidos();
		String datos = "";

		com.google.gson.JsonObject gson = new JsonObject();
		JsonArray array = new JsonArray();

		for (ProductoDTO p : lista) {
			JsonObject item = new JsonObject();
			// item.addProperty("img", "<img src='img/"+p.getCodigo()+".jpg' width='100px'
			// height='100px' />");
			item.addProperty("descripcion", p.getDescripcion());
			item.addProperty("cantidad", p.getCodigo());
			array.add(item);
		}

		gson.add("datos", array);
		out.println(gson.toString());

	}

}
