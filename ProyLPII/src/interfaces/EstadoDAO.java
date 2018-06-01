package interfaces;

import java.util.List;
import beans.EstadoDTO;

public interface EstadoDAO {

	        //metodo para registrar
			public int registrar(EstadoDTO c);

			// para eliminar
			public int eliminar(int codigo);

			// metodo para modificar 
			public int modificar(EstadoDTO c);
			
			//metodo para listar
			public List<EstadoDTO> listadoCliente();
	
}
