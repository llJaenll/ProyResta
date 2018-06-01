package beans;

public class ObjetoPersonaDTO {
	
	private int codigo;
	private String nombre;
	private String apePat;
	private String apeMat;
	private String telefono;
	private String fecha;
	
	public ObjetoPersonaDTO(int codigo, String nombre, String apePat, String apeMat, String telefono, String fecha) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.telefono = telefono;
		this.fecha = fecha;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePat() {
		return apePat;
	}

	public void setApePat(String apePat) {
		this.apePat = apePat;
	}

	public String getApeMat() {
		return apeMat;
	}

	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	
	

}
