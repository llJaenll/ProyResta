package service;

import java.util.ArrayList;
import java.util.List;

import beans.ProductoDTO;
import dao.DAOFactory;
import interfaces.ProductoDAO;

public class ProductoService implements ProductoDAO{

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	ProductoDAO dao =  fabrica.getProductoDAO();
	
	@Override
	public int registrar(ProductoDTO p, String ruta) {
		// TODO Auto-generated method stub
		return dao.registrar(p, ruta);
	}
	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return dao.eliminar(codigo);
	}
	@Override
	public int modificar(ProductoDTO p, String ruta) {
		// TODO Auto-generated method stub
		return dao.modificar(p, ruta);
	}
	@Override
	public List<ProductoDTO> listadoProducto() {
		// TODO Auto-generated method stub
		return dao.listadoProducto();
	}
	@Override
	public ProductoDTO buscarProducto(String des) {
		// TODO Auto-generated method stub
		return dao.buscarProducto(des);
	}
	@Override
	public ProductoDTO buscarProductoCod(int cod) {
		// TODO Auto-generated method stub
		return dao.buscarProductoCod(cod);
	}
	@Override
	public ArrayList<ProductoDTO> getImagenes(int cod) {
		// TODO Auto-generated method stub
		return dao.getImagenes(cod);
	}
	@Override
	public List<ProductoDTO> listarxCategoria(int cat) {
		// TODO Auto-generated method stub
		return dao.listarxCategoria(cat);
	}
	@Override
	public List<ProductoDTO> listarxStock() {
		// TODO Auto-generated method stub
		return dao.listarxStock();
	}
	@Override
	public List<ProductoDTO> listarProdMasVendidos(int cat) {
		// TODO Auto-generated method stub
		return dao.listarProdMasVendidos(cat);
	}	
	
}
