package service;

import java.util.List;

import beans.EstadoDTO;
import dao.DAOFactory;
import interfaces.EstadoDAO;

public class EstadoService implements EstadoDAO{

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	EstadoDAO dao =  fabrica.getEstadoDAO();
	
	@Override
	public int registrar(EstadoDTO c) {
		// TODO Auto-generated method stub
		return dao.registrar(c);
	}
	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return dao.eliminar(codigo);
	}
	@Override
	public int modificar(EstadoDTO c) {
		// TODO Auto-generated method stub
		return dao.modificar(c);
	}
	@Override
	public List<EstadoDTO> listadoCliente() {
		// TODO Auto-generated method stub
		return dao.listadoCliente();
	}	
	
}
