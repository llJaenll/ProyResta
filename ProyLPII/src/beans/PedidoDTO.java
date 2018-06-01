package beans;

public class PedidoDTO {
	private int id_pedido,id_usuario,mesa;
	private String fecha;
	private double total;
	
	public PedidoDTO(){
		
	}
	public PedidoDTO(int id_pedido, int id_usuario, int mesa, String fecha, double total) {
		super();
		this.id_pedido = id_pedido;
		this.id_usuario = id_usuario;
		this.mesa = mesa;
		this.fecha = fecha;
		this.total = total;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

}
