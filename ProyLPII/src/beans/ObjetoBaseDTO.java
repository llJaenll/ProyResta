package beans;

public class ObjetoBaseDTO {
	
	private int codigo;
	private String descripcion;
	
	public ObjetoBaseDTO(int codigo, String descripcion){
		this.codigo=codigo;
		this.descripcion=descripcion;		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	void prueba(){
		System.out.println(codigo+descripcion);
	}
	
	
	

}
