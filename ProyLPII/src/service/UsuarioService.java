package service;

import java.util.List;

import beans.TipoUsuarioDTO;
import beans.UsuarioDTO;
import beans.UsuarioTipoDTO;
import dao.DAOFactory;
import interfaces.DetalleDeliveryDAO;
import interfaces.UsuarioDAO;

public class UsuarioService implements UsuarioDAO{
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	UsuarioDAO dao =  fabrica.getUsuarioDAO();
	@Override
	public int registrar(UsuarioDTO c) {
		// TODO Auto-generated method stub
		return dao.registrar(c);
	}
	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return dao.eliminar(codigo);
	}
	@Override
	public int modificar(UsuarioDTO c) {
		// TODO Auto-generated method stub
		return dao.modificar(c);
	}
	@Override
	public List<UsuarioDTO> listadoUsuario() {
		// TODO Auto-generated method stub
		return dao.listadoUsuario();
	}
	@Override
	public UsuarioDTO validarUsuario(String nusuario, String contrase�a) {
		// TODO Auto-generated method stub
		return dao.validarUsuario(nusuario, contrase�a);
	}
	@Override
	public UsuarioDTO buscarUsuario(int codigo) {
		// TODO Auto-generated method stub
		return dao.buscarUsuario(codigo);
	}
	@Override
	public List<TipoUsuarioDTO> listarTipoUsaurio() {
		// TODO Auto-generated method stub
		return dao.listarTipoUsaurio();
	}
	@Override
	public List<UsuarioTipoDTO> listarUsuarioTipo() {
		// TODO Auto-generated method stub
		return dao.listarUsuarioTipo();
	}
	@Override
	public UsuarioDTO buscarUsuarioTipo(int codigo) {
		// TODO Auto-generated method stub
		return dao.buscarUsuarioTipo(codigo);
	}
	@Override
	public int cantidadUsuario() {
		// TODO Auto-generated method stub
		return dao.cantidadUsuario();
	}
	@Override
	public int validarDni(String dni) {
		// TODO Auto-generated method stub
		return dao.validarDni(dni);
	}	

}