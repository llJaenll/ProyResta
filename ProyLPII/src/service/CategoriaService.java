package service;

import java.util.List;

import beans.CategoriaDTO;
import dao.DAOFactory;
import interfaces.CategoriaDAO;

public class CategoriaService implements CategoriaDAO{
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	CategoriaDAO dao =  fabrica.getCategoriaDAO();

	@Override
	public int registrar(CategoriaDTO c) {
		// TODO Auto-generated method stub
		return dao.registrar(c);
	}

	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return dao.eliminar(codigo);
	}

	@Override
	public int modificar(CategoriaDTO c) {
		// TODO Auto-generated method stub
		return dao.modificar(c);
	}

	@Override
	public List<CategoriaDTO> listarCategoria() {
		// TODO Auto-generated method stub
		return dao.listarCategoria();
	}

}
