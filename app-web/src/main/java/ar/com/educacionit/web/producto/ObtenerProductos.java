package ar.com.educacionit.web.producto;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exeptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

public class ObtenerProductos {

	public static void main(String[] args) throws ServiceException {
	
		ProductoService productoService = new ProductoServiceImpl();
		
		Producto[] productos = productoService.obtenerProductos();

		if(productos != null) {
			//foreach
			for(Producto producto : productos) {
				System.out.println("Producto encontrado: " + producto);
				System.err.println("-------");
			}
		}else {
			System.out.println("No se han encontrado productos");
		}
	}

}
