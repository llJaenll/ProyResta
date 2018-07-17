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
@WebServlet("/ListarP")
public class ListarProducto extends HttpServlet {
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
		List<ProductoDTO> lista = ps.listadoProducto();
		String datos = "";

		com.google.gson.JsonObject gson = new JsonObject();
		JsonArray array = new JsonArray();

		for (ProductoDTO p : lista) {
			JsonObject item = new JsonObject();
			// item.addProperty("img", "<img src='img/"+p.getCodigo()+".jpg' width='100px'
			// height='100px' />");
			item.addProperty("descripcion", p.getDescripcion());
			item.addProperty("tipoCategoria", p.getTipoC());
			item.addProperty("precio", p.getPrecio());
			item.addProperty("stock", p.getStock());
			item.addProperty("acciones",
					"<a type='button' name='actualizar' id='" + p.getCodigo() + "' href='ActualizarProducto?id="
							+ p.getCodigo() + "' class='btn btn-info btn-xs actualizar' title='Actualizar'>"
							+ "<span class='fas fa-user-edit'></span></a>&nbsp"
							+ "<a type='button' name='eliminar' id='" + p.getCodigo()
							+ "' class='btn btn-danger btn-xs eliminar' title='Eliminar'>"
							+ "<span class='fas fa-trash-alt'></span></a>");
			array.add(item);
		}

		gson.add("datos", array);
		out.println(gson.toString());

	}

}
