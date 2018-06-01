package beans;

public class DetalleDeliveryDTO {
	
	private int idDelivery,idProducto,cantidad;
	private double precioProducto,subtotal;
	
	public DetalleDeliveryDTO(){
		
	};
		
	public DetalleDeliveryDTO(int idDelivery, int idProducto, int cantidad, double precioProducto, double subtotal) {
		super();
		this.idDelivery = idDelivery;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.precioProducto = precioProducto;
		this.subtotal=subtotal;
	}

	public int getidDelivery() {
		return idDelivery;
	}

	public void setidDelivery(int idDelivery) {
		this.idDelivery = idDelivery;
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
