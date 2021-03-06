package interfaces;

import java.util.List;

import beans.TipoUsuarioDTO;
import beans.UsuarioDTO;

public interface UsuarioDAO {

	    //metodo para registrar
		public int registrar(UsuarioDTO c);

		// para eliminar
		public int eliminar(int codigo);

		// metodo para modificar 
		public int modificar(UsuarioDTO c);
		
		//metodo para listar
		public List<UsuarioDTO> listadoUsuario();
		//NUEVO METODO PARA EL LOGIN
		public UsuarioDTO validarUsuario(String nusuario,String contraseņa);
		
		public UsuarioDTO buscarUsuario(int codigo);
		
		public List<TipoUsuarioDTO> listarTipoUsuario(); 
		
		public List<UsuarioDTO> listarUsuarioTipo();
		
		public UsuarioDTO buscarUsuarioTipo(int codigo);
		
		public int cantidadUsuario();
		
		public int validarDni(String dni);
	
}
