package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import beans.LocalDTO;
import service.LocalesService;

/**
 * Servlet implementation class ListarLocal
 */
@WebServlet("/ListarLocal")
public class ListarLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		LocalesService ls = new LocalesService();
		ArrayList<LocalDTO> listaLocales = ls.listar();
		String datos = "";
		com.google.gson.JsonObject gson = new JsonObject();
		JsonArray array = new JsonArray();

		for (LocalDTO localDTO : listaLocales) {
			System.out.println(localDTO.getLongitud());
			JsonObject item = new JsonObject();
			item.addProperty("id_Locales", localDTO.getIdLocal());
			item.addProperty("nombre_Locales", localDTO.getNombreLocal());
			item.addProperty("longitud_Locales", localDTO.getLongitud());
			item.addProperty("latitud_Locales", localDTO.getLatitud());
			array.add(item);
		}

		PrintWriter pw = response.getWriter();
		pw.print(array.toString());
		pw.close();

	}

}
