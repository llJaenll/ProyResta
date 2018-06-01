package service;

import java.util.List;

import beans.MotorizadoDTO;
import dao.DAOFactory;
import interfaces.MotorizadoDAO;

public class MotorizadoService implements MotorizadoDAO{

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	MotorizadoDAO dao =  fabrica.getMotorizadoDAO();
	
	@Override
	public int registrar(MotorizadoDTO c) {
		// TODO Auto-generated method stub
		return dao.registrar(c);
	}
	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return dao.eliminar(codigo);
	}
	@Override
	public int modificar(MotorizadoDTO c) {
		// TODO Auto-generated method stub
		return dao.modificar(c);
	}
	@Override
	public List<MotorizadoDTO> listadoMotorizado() {
		// TODO Auto-generated method stub
		return dao.listadoMotorizado();
	}
	@Override
	public MotorizadoDTO buscarMotorizado(int cod) {
		// TODO Auto-generated method stub
		return dao.buscarMotorizado(cod);
	}	
	
}
