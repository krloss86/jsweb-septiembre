package ar.com.educacionit.service;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exeptions.ServiceException;
//ctrl+shift+o
public interface ProductoService {

	//metodos de servicio que serviran para las diferentes
	//aplicaciones
	
	public Producto obtenerProductoById(Long id) throws ServiceException;
	
	public void eliminarProducto(Long id) throws ServiceException;
	
	public Producto[] obtenerProductos() throws ServiceException;
	
	public Producto nuevoProducto(Producto producto) throws ServiceException;
	
	public Producto actualizarProducto(Producto producto) throws ServiceException;
}
