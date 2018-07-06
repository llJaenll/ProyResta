package beans;

public class ContactenosDTO {
	public int  Id_Contactenos ;
	public String nombre_contactenos;
	public String correo_contactenos;
	public String telefono_contactenos ;
	public String mensaje_contactenos ;
	public int getId_Contactenos() {
		return Id_Contactenos;
	}
	public void setId_Contactenos(int id_Contactenos) {
		Id_Contactenos = id_Contactenos;
	}
	public String getNombre_contactenos() {
		return nombre_contactenos;
	}
	public void setNombre_contactenos(String nombre_contactenos) {
		this.nombre_contactenos = nombre_contactenos;
	}
	public String getCorreo_contactenos() {
		return correo_contactenos;
	}
	public void setCorreo_contactenos(String correo_contactenos) {
		this.correo_contactenos = correo_contactenos;
	}
	public String getTelefono_contactenos() {
		return telefono_contactenos;
	}
	public void setTelefono_contactenos(String telefono_contactenos) {
		this.telefono_contactenos = telefono_contactenos;
	}
	public String getMensaje_contactenos() {
		return mensaje_contactenos;
	}
	public void setMensaje_contactenos(String mensaje_contactenos) {
		this.mensaje_contactenos = mensaje_contactenos;
	}	
}
