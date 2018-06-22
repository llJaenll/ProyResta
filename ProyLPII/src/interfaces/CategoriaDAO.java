package interfaces;

import java.util.List;

import beans.CategoriaDTO;

public interface CategoriaDAO {

	        //metodo para registrar
			public int registrar(CategoriaDTO c);

			// para eliminar
			public int eliminar(int codigo);

			// metodo para modificar 
			public int modificar(CategoriaDTO c);
			
			//metodo para listar
			public List<CategoriaDTO> listarCategoria();
	
}
