package beans;

import java.awt.Image;

public class ProductoDTO extends ObjetoBaseDTO{

	private int tipoCategoria, stock,estado;
	private double precio;
	private Image imgProd;
	
	public ProductoDTO(int codigo, String descripcion) {
		super(codigo, descripcion);
		// TODO Auto-generated constructor stub
	}

	public ProductoDTO(int codigo,int tipoCategoria, String descripcion, double precio, int stock,  int estado, Image imgProd) {
		super(codigo, descripcion);
		this.tipoCategoria = tipoCategoria;
		this.stock = stock;
		this.precio = precio;
		this.estado = estado;
		this.imgProd = imgProd;
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

	public Image getImgProd() {
		return imgProd;
	}

	public void setImgProd(Image imgProd) {
		this.imgProd = imgProd;
	}
	
	
	
	
}
