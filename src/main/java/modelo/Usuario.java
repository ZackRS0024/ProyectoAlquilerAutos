package modelo;

import java.io.Serializable;
import java.sql.Date;


public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String correo;
	private String clave;
	private Date fechaRegistro;
	private String rol;
	
	
	public Usuario() {
		id = 0;
		nombre = "";
		correo = "";
		clave = "";
		fechaRegistro = new Date(0);
		rol = "";
	}
	
	public Usuario(int id, String nombre, String correo, String clave, Date fechaRegistro, String rol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.clave = clave;
		this.fechaRegistro = fechaRegistro;
		this.rol = rol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	    
	}


