package dao;

import interfaces.CategoriaDAO;
import interfaces.ClienteDAO;
import interfaces.DeliveryDAO;
import interfaces.DetalleDeliveryDAO;
import interfaces.EstadoDAO;
import interfaces.LocalDAO;
import interfaces.MotorizadoDAO;
import interfaces.ProductoDAO;
import interfaces.UsuarioDAO;

public abstract class DAOFactory {
	// Constantes con los tipos de BD
	public static final int MYSQL = 1;
	public static final int SQL = 2;

	public abstract UsuarioDAO getUsuarioDAO();
	public abstract ClienteDAO getClienteDAO();
	public abstract DeliveryDAO getDeliveryDAO();
	public abstract DetalleDeliveryDAO getDetalleDeliveryDAO();
	public abstract EstadoDAO getEstadoDAO();
	public abstract MotorizadoDAO getMotorizadoDAO();
	public abstract ProductoDAO getProductoDAO();
	public abstract CategoriaDAO getCategoriaDAO();
	public abstract LocalDAO getLocalDAO();
	

	public static DAOFactory getDAOFactory(int qFactory) {
		switch (qFactory) {
		case MYSQL:
			return new MySQLDAOFactory(); 
		
		default:
			return null;
		}
	}

}
