package ar.com.educacionit.web.servlet.lambdas;

import java.util.Collection;
import java.util.stream.Collectors;

import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exeptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

public class ProductoMain {

	public static void main(String[] args) throws ServiceException {
		
		ProductoService ps = new ProductoServiceImpl();

		//suma de los product
		Float suma = ps.obtenerProductos()
		.stream()
		.filter(p -> p.getPrecio() >35400)
		.map(producto -> producto.getPrecio())
		.reduce(0F, Float::sum);
				
		System.out.println(suma);
		
		
		
		
		
	}

}
