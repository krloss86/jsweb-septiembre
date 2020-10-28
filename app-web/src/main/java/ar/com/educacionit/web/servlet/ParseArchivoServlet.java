package ar.com.educacionit.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exeptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;
import ar.com.educacionit.web.parsers.FileParserBuilder;
import ar.com.educacionit.web.parsers.Parseable;

@WebServlet("/parseArchivoServlet")
public class ParseArchivoServlet extends HttpServlet {

	private ProductoService ps = new ProductoServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String filePath = "nuevos-productos.csv";
		
		String realFilePath = getServletContext().getRealPath(filePath);
		
		Parseable parseable = FileParserBuilder.getParser(realFilePath);
		
		Collection<Producto> productosDesdeArchivo = parseable.parse();
		
		Collection<Producto> productosOK = new ArrayList<Producto>();
		Collection<Producto> productosFail = new ArrayList<Producto>();
		
		for(Producto producto : productosDesdeArchivo) {
			try {
				ps.nuevoProducto(producto);
				productosOK.add(producto);
			} catch (ServiceException e) {
				productosFail.add(producto);
			}
		}
		
		//request
		req.setAttribute("listadoOK", productosOK);
		
		//session
		req.getSession().setAttribute("listadoFail", productosFail);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/listadoGeneral.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		this.doPost(req, resp);
	}
}
