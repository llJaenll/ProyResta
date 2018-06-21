package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ProductoDTO;
import service.ProductoService;

/**
 * Servlet implementation class Regp
 */
@WebServlet("/Regp")
public class Regp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletResponse response,String msg) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		  ProductoDTO p = new ProductoDTO(0, 1, 
					request.getParameter("nom_Prod"), Double.parseDouble(request.getParameter("precio_Prod")), 
							Integer.parseInt(request.getParameter("stock_Prod")), 0, "");
			ProductoService ps = new ProductoService();
			int ok = ps.registrar(p);
			
			if (ok==0) {
				service(response, "Error");
			} else {
				service(response, "Se registro");
			}
	}

}
