package ar.com.educacionit.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exeptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

@WebServlet("/NuevoProductoServlet")
public class NuevoProductoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String titulo = req.getParameter("titulo");
		String codigo = req.getParameter("titulo");
		String precio = req.getParameter("titulo");
		String tipoProducto = req.getParameter("titulo");
		
		Float precioF = Float.parseFloat(precio);
		Long tipoProductoL = Long.parseLong(tipoProducto);
		
		//la capa de servicio
		ProductoService ps = new ProductoServiceImpl();
		Producto producto = new Producto(titulo,precioF,codigo,tipoProductoL);
		
		String salida = "";
		try {
			producto = ps.nuevoProducto(producto);
			salida  = "altaExitosa.jsp";
		} catch (ServiceException e) {
			e.printStackTrace();
			salida  = "altaFallida.jsp";
		}
		
		
	}
}
