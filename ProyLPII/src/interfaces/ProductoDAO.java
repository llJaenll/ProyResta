package interfaces;

import java.util.ArrayList;
import java.util.List;

import beans.CategoriaDTO;
import beans.ProductoDTO;

public interface ProductoDAO {
	
	//metodo para registrar
		public int registrar(ProductoDTO p);

		// para eliminar
		public int eliminar(int codigo);

		// metodo para modificar 
		public int modificar(ProductoDTO p);
		//metodo para listar
		public List<ProductoDTO> listadoProducto();
		
		public ProductoDTO buscarProducto(String des);
		
		public ProductoDTO buscarProductoCod(int cod);
		
		public ArrayList<ProductoDTO> getImagenes(int cod);
		
		public List<ProductoDTO> listarxCategoria(int cat);
		
		public List<ProductoDTO> listarxStock();
		
		public List<ProductoDTO> listarProdMasVendidos();
		
		public List<CategoriaDTO> listarTipoProducto(); 
		
		public int codigoCorrelativo();
		
		

}
