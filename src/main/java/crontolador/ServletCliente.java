package crontolador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.MySQL;

@WebServlet("/Cliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nombre=request.getParameter("nombre");
		 String apellido=request.getParameter("apellido");;
		 String dni=request.getParameter("dni");;
		 String telefono=request.getParameter("telefono");;
		 String email=request.getParameter("email");;
		 String direccion=request.getParameter("direccion");;
		 
		 
		 //Procesar dato: registro
		 //Crear conexion a la base de datos
		 Connection cnx=MySQL.getConexion();
		 String sql="INSERT INTO CLIENTE (nombre, apellido, dni, telefono, email, direccion)"+
				" VALUES(?,?,?,?,?,?)";
		 try {
			PreparedStatement ps=cnx.prepareStatement(sql);
			//completar la instancia insert
			ps.setString(1, nombre);
			ps.setString(2, apellido);
			ps.setString(3, dni);
			ps.setString(4, telefono);
			ps.setString(5, email);
			ps.setString(6, direccion);
			
			
			//ejecutar insert
			int resultado=ps.executeUpdate();//1 si se registro; de lo contrario 0.
			String mensaje=(resultado==1)?"Registro Satisfactorio":"Error en el Registro";
			//respuesta del servlet
			response.sendRedirect("index.jsp?mensaje="+mensaje);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
