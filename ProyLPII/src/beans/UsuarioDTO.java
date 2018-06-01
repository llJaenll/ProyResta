package beans;

public class UsuarioDTO extends ObjetoPersonaDTO {

	private String dni,usuario,contrase�a;
	private int tipoUsuario;
	private int estado;
	

	public UsuarioDTO(int codigo, String nombre, String apePat, String apeMat, String telefono, String fecha, String dni,
			String usuario, String contrase�a, int tipoUsuario) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		this.dni = dni;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.tipoUsuario = tipoUsuario;
	}

	public UsuarioDTO(int codigo,int tipoUsuario, String nombre, String apePat, String apeMat, String dni, String telefono, String fecha,
			 int estado,String usuario, String contrase�a) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		this.dni = dni;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
