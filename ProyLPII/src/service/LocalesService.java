package service;

import java.util.ArrayList;

import dao.DAOFactory;
import beans.LocalDTO;
import interfaces.LocalDAO;

public class LocalesService implements LocalDAO{

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	LocalDAO dao = fabrica.getLocalDAO();
	@Override
	public ArrayList<LocalDTO> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

}
