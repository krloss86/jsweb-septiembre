package ar.com.educacionit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorConexiones {

	public static Connection obtenerConexion() throws Exception {
		
		//nombre 
		//ctrl+shift+t
		//String driver = "com.mysql.cj.jdbc.Driver";
		String driver = "com.mysql.jdbc.Driver";
		
		String dbConnectionString = "jdbc:mysql://localhost:3306/jsweb-septiembre?serverTimezone=UTC";
		
		//username
		String username = "root";
		
		//password
		String password = "root";
		
        // Establece el driver de conexion
		Class.forName(driver).newInstance();
		
		//retornar la conexion
		Connection con = DriverManager.getConnection(dbConnectionString, username, password);
		
		return con;
	}
}
