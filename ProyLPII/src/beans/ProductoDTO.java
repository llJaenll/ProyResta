package beans;

import java.awt.Image;

public class ProductoDTO extends ObjetoBaseDTO{

	private int tipoCategoria, stock,estado;
	private double precio;
	private String imgProd,tipoC;
	
	public ProductoDTO(int codigo, String descripcion) {
		super(codigo, descripcion);
		// TODO Auto-generated constructor stub
	}

	public ProductoDTO(int codigo,int tipoCategoria, String descripcion, double precio, int stock,  int estado) {
		super(codigo, descripcion);
		this.tipoCategoria = tipoCategoria;
		this.stock = stock;
		this.precio = precio;
		this.estado = estado;
	}

	public ProductoDTO(int codigo,String descripcion,String tipoC,double precio,int stock, int estado 
			) {
		super(codigo, descripcion);
		this.stock = stock;
		this.estado = estado;
		this.precio = precio;
		this.tipoC = tipoC;
	}

	public int getTipoCategoria() {
		return tipoCategoria;
	}

	public void setTipoCategoria(int tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getImgProd() {
		return imgProd;
	}

	public void setImgProd(String imgProd) {
		this.imgProd = imgProd;
	}

	public String getTipoC() {
		return tipoC;
	}

	public void setTipoC(String tipoC) {
		this.tipoC = tipoC;
	}

	
	
	
	
}
