package servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import beans.ProductoDTO;
import service.ProductoService;

/**
 * Servlet implementation class RegistrarProducto
 */
@WebServlet("/RegistrarProducto")
public class RegistrarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String msgR = "";
		// obtenemos el codigo correlativo
		ProductoService prs = new ProductoService();
		int codImg = prs.codigoCorrelativo();

		int Id_TipoCat = 0, stock_Prod = 0;
		double precio_Prod = 0;
		String nom_Prod = "";

		try {
			FileItemFactory file_factory = new DiskFileItemFactory();

			/* ServletFileUpload esta clase convierte los input file a FileItem */
			ServletFileUpload servlet_up = new ServletFileUpload(file_factory);
			/* sacando los FileItem del ServletFileUpload en una lista */
			List items = servlet_up.parseRequest(request);

			for (int i = 0; i < items.size(); i++) {
				/*
				 * FileItem representa un archivo en memoria que puede ser pasado al disco duro
				 */
				FileItem item = (FileItem) items.get(i);
				// nombre real del archivo para guardar
				/* item.isFormField() false=input file; true=text field */
				if ("Id_TipoCat".equals(item.getFieldName())) {
					Id_TipoCat = Integer.parseInt(item.getString());
				}

				if ("stock_Prod".equals(item.getFieldName())) {
					stock_Prod = Integer.parseInt(item.getString());
				}

				if ("precio_Prod".equals(item.getFieldName())) {
					precio_Prod = Double.parseDouble(item.getString());
				}
				if ("nom_Prod".equals(item.getFieldName())) {
					nom_Prod = item.getString();
				}

				if (!item.isFormField()) {
					String n[] = item.getName().replace("\\", "-").split("-");
					String nombreReal = n[n.length - 1];
					/* cual sera la ruta al archivo en el servidor */
					File archivo_server = new File("D:\\" + codImg + ".jpg");
					/* y lo escribimos en el servido */
					item.write(archivo_server);
					out.print("Nombre --> " + item.getName());
					out.print("<br> Tipo --> " + item.getContentType());
					out.print("<br> tamaño --> " + (item.getSize() / 1240) + "KB");
					out.print("<br>");
				}
			}

			ProductoDTO p = new ProductoDTO(0, Id_TipoCat, nom_Prod, precio_Prod, stock_Prod, 0);
			ProductoService ps = new ProductoService();
			int ok = ps.registrar(p);

			if (ok == 0) {
				out.println("Error");
			} else {
				msgR = "Producto Registrado";
				request.setAttribute("msgR", msgR);
				request.getRequestDispatcher("RegistroProducto.jsp").forward(request, response);
			}

		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("Error " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			out.println("Error " + e.getMessage());

		}

	}

}
