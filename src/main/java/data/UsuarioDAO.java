package data;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import modelo.Usuario;

public class UsuarioDAO {
  
	public class UsuarioDao {
		 
		public Usuario validar(String correo, String clave) {
			Usuario usuario = null;
			String sql = "{CALL validar_usuario(?,?)}";
			
			try {
				Connection cnx = MySQL.getConexion();
				CallableStatement stmt = cnx.prepareCall(sql);
				stmt.setString(1, correo);
				stmt.setString(2, clave);
				
				ResultSet rs = stmt.executeQuery();
				if(rs.next()) {
					int id = rs.getInt("ID");
					String nombre = rs.getString("nombre");
					String rol = rs.getString("rol");
					if(id != 0) {
						 usuario = new Usuario();
							
						  usuario = new Usuario();
							usuario.setId(id);
							usuario.setNombre(nombre);
							usuario.setCorreo(correo);
							usuario.setRol(rol);
							
						
					}
				}
				
				cnx.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return usuario;
		}
	}

	public Usuario validar(String correo, String clave) {
		// TODO Auto-generated method stub
		return null;
	}




}
