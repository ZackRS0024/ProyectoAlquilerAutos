package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQL {

	public static Connection getConexion() {
		Connection conexion = null;
		
		try {
			Class.forName("com.mysql.cj..jdbc.Driver");
			String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/BD_AlquilerAutos";
			String usuario = "root";
			String clave = "mysql";
              
			conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return conexion;
	
  }
}
