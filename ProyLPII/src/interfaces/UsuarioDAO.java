package interfaces;

import java.util.List;

import beans.TipoUsuarioDTO;
import beans.UsuarioDTO;
import beans.UsuarioTipoDTO;

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
		public UsuarioDTO validarUsuario(String nusuario,String contraseña);
		
		public UsuarioDTO buscarUsuario(int codigo);
		
		public List<TipoUsuarioDTO> listarTipoUsaurio(); 
		
		public List<UsuarioTipoDTO> listarUsuarioTipo();
		
		public UsuarioDTO buscarUsuarioTipo(int codigo);
		
		public int cantidadUsuario();
		
		public int validarDni(String dni);
	
}
