package beans;

public class UsuarioDTO extends ObjetoPersonaDTO {

	private String dni,usuario,contraseña;
	private int tipoUsuario;
	private int estado;
	

	public UsuarioDTO(int codigo, String nombre, String apePat, String apeMat, String telefono, String fecha, String dni,
			String usuario, String contraseña, int tipoUsuario) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		this.dni = dni;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.tipoUsuario = tipoUsuario;
	}

	public UsuarioDTO(int codigo,int tipoUsuario, String nombre, String apePat, String apeMat, String dni, String telefono, String fecha,
			 int estado,String usuario, String contraseña) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		this.dni = dni;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.tipoUsuario = tipoUsuario;
		this.estado = estado;
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

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	

	
	
	
	
	
	
	
	

}
