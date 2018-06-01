package beans;

public class MuestraDetalleDTO {

	private int idProd,cantidad,id_pedido;
	private String NomProducto,fecha;
	private double precioProducto,subtotal;
	
	public MuestraDetalleDTO(int cantidad,String nomProducto, double precioProducto, double subtotal) {
		super();
		this.cantidad = cantidad;
		this.NomProducto = nomProducto;
		this.precioProducto = precioProducto;
		this.subtotal = subtotal;
	}
	
	public MuestraDetalleDTO(int idProd, String nomProducto,int cantidad, double precioProducto, double subtotal) {
		super();
		this.idProd= idProd;
		this.cantidad = cantidad;
		this.NomProducto = nomProducto;
		this.precioProducto = precioProducto;
		this.subtotal = subtotal;
	}
	
	public MuestraDetalleDTO(String nomProducto, int cantidad,String fecha,int id_pedido){
		super();
		this.id_pedido=id_pedido;
		this.fecha=fecha;
		this.NomProducto = nomProducto;
		this.cantidad = cantidad;
	}
	public MuestraDetalleDTO(String fecha,int id_pedido){
		super();
		this.fecha=fecha;
		this.id_pedido=id_pedido;
	}

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getNomProducto() {
		return NomProducto;
	}


	public void setNomProducto(String nomProducto) {
		NomProducto = nomProducto;
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


	public int getIdProd() {
		return idProd;
	}


	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	
	
	
	
	
}
