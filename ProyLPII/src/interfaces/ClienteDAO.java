package interfaces;

import java.util.List;

import beans.ClienteDTO;

public interface ClienteDAO {
	//metodo para registrar
	public int registrar(ClienteDTO c);

	// para eliminar
	public int eliminar(int codigo);

	// metodo para modificar 
	public int modificar(ClienteDTO c);
	//metodo para listar
	public List<ClienteDTO> listadoCliente();
	
	public ClienteDTO buscarCliente(int cod);
}
