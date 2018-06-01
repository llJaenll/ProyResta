package dao;

import interfaces.CategoriaDAO;
import interfaces.ClienteDAO;
import interfaces.DeliveryDAO;
import interfaces.DetalleDeliveryDAO;
import interfaces.EstadoDAO;
import interfaces.MotorizadoDAO;
import interfaces.ProductoDAO;
import interfaces.UsuarioDAO;

public class MySQLDAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new MYSQLUsuarioDAO();
	}

	@Override
	public ClienteDAO getClienteDAO() {
		// TODO Auto-generated method stub
		return new MYSQLClienteDAO();
	}

	@Override
	public DeliveryDAO getDeliveryDAO() {
		// TODO Auto-generated method stub
		return new MYSQLDeliveryDAO();
	}

	@Override
	public DetalleDeliveryDAO getDetalleDeliveryDAO() {
		// TODO Auto-generated method stub
		return new MYSQLDetalleDeliveryDAO();
	}

	@Override
	public EstadoDAO getEstadoDAO() {
		// TODO Auto-generated method stub
		return new MYSQLEstadoDAO() ;
	}

	@Override
	public MotorizadoDAO getMotorizadoDAO() {
		// TODO Auto-generated method stub
		return new MYSQLMotorizadoDAO();
	}

	@Override
	public ProductoDAO getProductoDAO() {
		// TODO Auto-generated method stub
		return new MYSQLProductoDAO();
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		// TODO Auto-generated method stub
		return new MYSQLCategoriaDAO();
	}


}
