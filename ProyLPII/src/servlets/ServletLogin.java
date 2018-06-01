package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UsuarioDTO;
import service.UsuarioService;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//variables
		
				String usuario,clave;
				
				//entradas
				
				usuario = request.getParameter("usuario");
				clave= request.getParameter("password");
				
				//procesos
				
				UsuarioService service = new UsuarioService();
				UsuarioDTO u = service.validarUsuario(usuario, clave);
				
				//salidas
				
				if(u!=null) {
					
					//éxito
					request.setAttribute("msj", "Sus credenciales son correctas!");
					request.getRequestDispatcher("/IndexAdministracion.jsp").forward(request, response);
					
				}else {
					request.setAttribute("msj", "Credenciales Invalidas");
					request.getRequestDispatcher("/Login.jsp").forward(request, response);
					
					
					
				}
		
		
	}

}
