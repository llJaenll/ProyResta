package dao;

import java.util.List;

import beans.TipoUsuarioDTO;
import beans.UsuarioDTO;
import beans.UsuarioTipoDTO;
import interfaces.UsuarioDAO;

public class MYSQLUsuarioDAO implements UsuarioDAO {

	@Override
	public int registrar(UsuarioDTO c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificar(UsuarioDTO c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UsuarioDTO> listadoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO validarUsuario(String nusuario, String contraseña) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO buscarUsuario(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoUsuarioDTO> listarTipoUsaurio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioTipoDTO> listarUsuarioTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO buscarUsuarioTipo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadUsuario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int validarDni(String dni) {
		// TODO Auto-generated method stub
		return 0;
	}

}
