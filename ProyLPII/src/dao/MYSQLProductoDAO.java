package dao;

import java.util.ArrayList;
import java.util.List;

import beans.ProductoDTO;
import interfaces.ProductoDAO;

public class MYSQLProductoDAO implements ProductoDAO {

	@Override
	public int registrar(ProductoDTO p, String ruta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificar(ProductoDTO p, String ruta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductoDTO> listadoProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO buscarProducto(String des) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO buscarProductoCod(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ProductoDTO> getImagenes(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDTO> listarxCategoria(int cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDTO> listarxStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDTO> listarProdMasVendidos(int cat) {
		// TODO Auto-generated method stub
		return null;
	}

}
