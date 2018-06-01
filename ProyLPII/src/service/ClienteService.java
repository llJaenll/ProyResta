package service;

import java.util.List;

import beans.ClienteDTO;
import dao.DAOFactory;
import interfaces.ClienteDAO;

public class ClienteService implements ClienteDAO{

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	ClienteDAO dao =  fabrica.getClienteDAO();
	
	@Override
	public int registrar(ClienteDTO c) {
		// TODO Auto-generated method stub
		return dao.registrar(c);
	}

	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return dao.eliminar(codigo);
	}

	@Override
	public int modificar(ClienteDTO c) {
		// TODO Auto-generated method stub
		return dao.modificar(c);
	}

	@Override
	public List<ClienteDTO> listadoCliente() {
		// TODO Auto-generated method stub
		return dao.listadoCliente();
	}

	@Override
	public ClienteDTO buscarCliente(int cod) {
		// TODO Auto-generated method stub
		return dao.buscarCliente(cod);
	}

}
