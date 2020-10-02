package ar.com.educacionit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import ar.com.educacionit.dao.exeptions.DuplicatedException;
import ar.com.educacionit.dao.exeptions.GenericDAOException;
import ar.com.educacionit.dao.exeptions.NonExistException;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.jdbc.AdministradorConexiones;

//ctrl+shift+o
public class ProductoDAO {

	public static Producto createProducto(Producto producto) throws DuplicatedException, GenericDAOException {

		// ctrl+shift+o
		// ctrl+space

		// ctrl+shift+f
		Connection connection;
		try {
			connection = AdministradorConexiones.obtenerConexion();
		} catch (Exception e) {
			throw new GenericDAOException(e.getMessage(), e);
		}

		// select * from producto
		String sql = "INSERT INTO productos (titulo, precio, codigo, tipo_producto) VALUES ('" + producto.getTitulo() + "', '"
				+ producto.getPrecio() + "', '" + producto.getCodigo()+ "', '" + producto.getTipoProducto() + "')";

		Statement st;
		try {

			st = connection.createStatement();
			
			int resultado = st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			
			ResultSet rs = st.getGeneratedKeys();
			
			Long idGenerado = null;
			
			if (rs.next()) {
				idGenerado = rs.getLong(1);
			}
			
			producto.setId(idGenerado);
		}catch(SQLIntegrityConstraintViolationException sicve) {
			throw new DuplicatedException(sicve.getMessage(), sicve);
		} catch (SQLException e) {
			throw new GenericDAOException(e.getMessage(), e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new GenericDAOException("NO se pudo cerrar la conexion, verfique en la DB las conexiones", e);
			}
		}

		return producto;
	}

	public static void deleteProducto(Long id) throws NonExistException {

	}

	public Producto get(Long id) throws GenericDAOException {

		return null;
	}

	public Producto[] obtenerTodos() throws GenericDAOException {

		return null;
	}
}
