package beans;


public class MotorizadoDTO extends ObjetoPersonaDTO {
	
	String dni,nroBrevete,placaAutomovil,fechaIng;
	int estado;
	
	public MotorizadoDTO(int codigo, String nombre, String apePat, String apeMat, String telefono, String fecha) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		// TODO Auto-generated constructor stub
	}

	public MotorizadoDTO(int codigo, String nombre, String apePat, String apeMat, String telefono, String fecha,
			String dni, String nroBrevete, String placaAutomovil, String fechaIng, int estado) {
		super(codigo, nombre, apePat, apeMat, telefono, fecha);
		this.dni = dni;
		this.nroBrevete = nroBrevete;
		this.placaAutomovil = placaAutomovil;
		this.fechaIng = fechaIng;
		this.estado = estado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNroBrevete() {
		return nroBrevete;
	}

	public void setNroBrevete(String nroBrevete) {
		this.nroBrevete = nroBrevete;
	}

	public String getPlacaAutomovil() {
		return placaAutomovil;
	}

	public void setPlacaAutomovil(String placaAutomovil) {
		this.placaAutomovil = placaAutomovil;
	}

	public String getFechaIng() {
		return fechaIng;
	}

	public void setFechaIng(String fechaIng) {
		this.fechaIng = fechaIng;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

	
	
}
