package service;

import beans.ContactenosDTO;
import dao.DAOFactory;
import interfaces.ContactenosDAO;

public class ContactenosService implements ContactenosDAO {
DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
ContactenosDAO dao = fabrica.getContactenosDAO();
@Override
public int registrar(ContactenosDTO cn) {
	// TODO Auto-generated method stub
	return dao.registrar(cn);
}


}
