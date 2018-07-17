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
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class SubirServlet
 */
@WebServlet("/SubirServlet")
public class SubirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String archivourl = "C:\\xampp\\htdocs\\ProyResta\\ProyLPII\\WebContent\\img";
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(1024);
		factory.setRepository(new File(archivourl));
		ServletFileUpload upload = new ServletFileUpload(factory);
		System.out.println(upload);

		try {
			List<FileItem> partes = upload.parseRequest(request);
			for (FileItem items : partes) {
				System.out.println(items.getName());// esto es el nombre
				File file = new File(archivourl, "2.jpg");// aqui se manda el nombre
				items.write(file);

			}
			out.print("impreseion");
		} catch (Exception e) {
			out.print("Exception:" + e.getMessage());
		}

	}

}
