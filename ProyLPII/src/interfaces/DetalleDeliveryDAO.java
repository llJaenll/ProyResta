package interfaces;

import java.util.List;


import beans.DetalleDeliveryDTO;
import beans.MuestraDetalleDTO;

public interface DetalleDeliveryDAO {
	
	//metodo para registrar
	public int registrar(DetalleDeliveryDTO dp);
	
	public int actualizar(DetalleDeliveryDTO dp);

	// para eliminar
	public int eliminar(DetalleDeliveryDTO dp);
	
	 public List<MuestraDetalleDTO> buscarDetalleDelivery(int cod);
	 
	 public int eliminarDeliverys(int idped);
	 
	 public int totalDelivery(int cod);
	 
	 public int actualizarCancelacion(int idprod, int cantidad);
	 
	 public List<MuestraDetalleDTO> listarOrdenado(int ped);
	 
	 public int totalDeliveryEstado(int cod);
		 
}
