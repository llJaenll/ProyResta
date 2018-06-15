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

import beans.UsuarioDTO;
import service.UsuarioService;

/**
 * Servlet implementation class Listar
 */
@WebServlet("/Listar")
public class ListarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		UsuarioService us = new UsuarioService();
		List<UsuarioDTO> lista = us.listarUsuarioTipo();
		String datos="";
		
		com.google.gson.JsonObject gson = new JsonObject();
		JsonArray array = new JsonArray();
	
		for (UsuarioDTO usuarioDTO : lista) {
			JsonObject item = new JsonObject();
			item.addProperty("nom_Usu", usuarioDTO.getNombre());
			item.addProperty("dni_Usu", usuarioDTO.getDni());
			item.addProperty("telf_Usu", usuarioDTO.getTelefono());
			item.addProperty("Id_TipoUsu", usuarioDTO.getTipoU());
			item.addProperty("usuario", usuarioDTO.getUsuario());
			item.addProperty("fechIng_Usu", usuarioDTO.getFecha());
			item.addProperty("acciones", "<button type='button' name='actualizar' id='"+
							usuarioDTO.getCodigo()+"' class='btn btn-info btn-xs actualizar' title='Actualizar'>"
							+ "<span class='fas fa-user-edit'></span></button>&nbsp"
							+ "<button type='button' name='eliminar' id='"+
							usuarioDTO.getCodigo()+"' class='btn btn-danger btn-xs eliminar' title='Eliminar'>"
							+ "<span class='fas fa-trash-alt'></span></button>");
			array.add(item);
		}
		
		gson.add("datos", array);
		out.println(gson.toString());
		
	}

}
