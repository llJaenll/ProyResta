package beans;

public class LocalDTO {
	private int idLocal;
	private String nombreLocal;
	private double latitud,longitud;
	
	public LocalDTO(int idLocal, String nombreLocal, double latitud,double longitud) {
		super();
		this.idLocal = idLocal;
		this.nombreLocal = nombreLocal;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	public int getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}
	public String getNombreLocal() {
		return nombreLocal;
	}
	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
}
