package beans;

public class DetallePedidoDTO {
	
	private int idPedido,idProducto,cantidad;
	private double precioProducto,subtotal;
	
	public DetallePedidoDTO(){
		
	};
		
	public DetallePedidoDTO(int idPedido, int idProducto, int cantidad, double precioProducto, double subtotal) {
		super();
		this.idPedido = idPedido;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.precioProducto = precioProducto;
		this.subtotal=subtotal;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
	
}
