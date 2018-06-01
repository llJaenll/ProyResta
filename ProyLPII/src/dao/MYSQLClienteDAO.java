package dao;

import java.util.List;

import beans.ClienteDTO;
import interfaces.ClienteDAO;

public class MYSQLClienteDAO implements ClienteDAO {

	@Override
	public int registrar(ClienteDTO c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificar(ClienteDTO c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ClienteDTO> listadoCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDTO buscarCliente(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

}
