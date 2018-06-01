package beans;

public class UsuarioTipoDTO extends ObjetoPersonaDTO {

	private String Nombretipo,dni,usuario,contrase�a;

	
	
	public UsuarioTipoDTO(int codigo,
			String nombretipo, String nombre, String apePat, String apeMat, String telefono, String fecha, String dni, String usuario, String contrase�a) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		Nombretipo = nombretipo;
		this.dni = dni;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
	
}
