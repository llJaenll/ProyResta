package beans;

public class UsuarioTipoDTO extends ObjetoPersonaDTO {

	private String Nombretipo,dni,usuario,contraseña;

	
	
	public UsuarioTipoDTO(int codigo,
			String nombretipo, String nombre, String apePat, String apeMat, String telefono, String fecha, String dni, String usuario, String contraseña) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		Nombretipo = nombretipo;
		this.dni = dni;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}


	public UsuarioTipoDTO(int codigo, String nombre, String apePat, String apeMat, String telefono, String fecha) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		// TODO Auto-generated constructor stub
	}


	public String getNombretipo() {
		return Nombretipo;
	}


	public void setNombretipo(String nombretipo) {
		Nombretipo = nombretipo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
}
