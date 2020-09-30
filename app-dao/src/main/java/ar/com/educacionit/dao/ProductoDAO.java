package ar.com.educacionit.dao;

import ar.com.educacionit.dao.exeptions.DuplicatedException;
import ar.com.educacionit.dao.exeptions.GenericDAOException;
import ar.com.educacionit.dao.exeptions.NonExistException;
import ar.com.educacionit.domain.Producto;
//ctrl+shift+o
public class ProductoDAO {
	
	static int contadorNuevosProducto = 0;

	public static Producto createProducto() throws DuplicatedException {
		
		//magia para acceder a la db
		Producto producto = new Producto("IRON MAN3", 1500f, "0001");
		
		//insert into producto ....
		
		producto.setId(1L);
		
		ProductoDAO.contadorNuevosProducto++;

		if(contadorNuevosProducto %2 == 0) {
			throw new DuplicatedException("El producto con codigo:" + producto.getCodigo() +" ya existe");
		}
		
		return producto;
	}
	
	public static Producto createProducto(Producto producto) throws DuplicatedException, GenericDAOException{
		
		//insert into producto ....
		
		// producto.setId(1L);
		
		ProductoDAO.contadorNuevosProducto++;

		if(producto.getCodigo().equals("0002")) {
			throw new GenericDAOException("Error inesperado al intentar grabar el producto con codigo=" + producto.getCodigo());
		}
		if(contadorNuevosProducto %2 == 0) {
			throw new DuplicatedException("El producto con codigo:" + producto.getCodigo() +" ya existe");
		}
		
		return producto;
	}

	public static void deleteProducto(Long id) throws NonExistException {
		
		//delete from tabla where ....
		if(id < 1000) {
			throw new NonExistException("El id : " + id + " no existe en la base de datos");
		}
	}

	public Producto get(Long id) throws GenericDAOException {
		
		// TODO Auto-generated method stub
		//select * from producto
		
		//magia para acceder a la db
		Producto producto = new Producto(id, "IRON MAN3", 1500f, "0001");
		
		if(id < 10) {
			throw new GenericDAOException("Error inesperado, obtiendo el producto id="+id);
		}
		
		return producto;
	}
}
