package interfaces;

import java.util.List;

import beans.MotorizadoDTO;

public interface MotorizadoDAO {
	//metodo para registrar
	public int registrar(MotorizadoDTO c);

	// para eliminar
	public int eliminar(int codigo);

	// metodo para modificar 
	public int modificar(MotorizadoDTO c);
	//metodo para listar
	public List<MotorizadoDTO> listadoMotorizado();
	
	public MotorizadoDTO buscarMotorizado(int cod);
}
