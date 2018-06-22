package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DetalleDeliveryDTO;
import beans.ProductoDTO;
import service.ProductoService;

/**
 * Servlet implementation class ServletCarro
 */
@WebServlet("/ServletCarro")
public class ServletCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//capturamos los datos del formulario de Compra
		int cantidad=Integer.parseInt(request.getParameter("cant"));
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println("cant"+cantidad+" id"+id);
		//se captura el producto enviado al formulario
		ProductoService ps = new ProductoService();
		ProductoDTO p= ps.buscarProductoCod(id);
		
		int idprod = p.getCodigo();
		String descripcion = p.getDescripcion();
		double preciovta = p.getPrecio();
		System.out.println("pre"+p.getPrecio());
		//obtenemos los datos globales de session
		ArrayList<DetalleDeliveryDTO> carro = (ArrayList<DetalleDeliveryDTO>)request.getSession().getAttribute("carro");
		double subtotalventa=(double)request.getSession().getAttribute("subtotalventa");
		
		//agregamos el producto y actualizamos el total
		DetalleDeliveryDTO v = new DetalleDeliveryDTO();
		
		v.setCantidad(cantidad);
		carro.add(v);
		subtotalventa +=(cantidad * preciovta);
		
		request.getSession().setAttribute("carro", carro);
		request.getSession().setAttribute("subtotal", subtotalventa);
		
		//visualiza el jsp
		request.getRequestDispatcher("listaitems2.jsp").forward(request, response);
		
		
	}

}
