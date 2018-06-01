package service;

import dao.DAOFactory;
import interfaces.DetalleDeliveryDAO;

public class UsuarioService {
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	DetalleDeliveryDAO dao =  fabrica.getDetalleDeliveryDAO();	

}
