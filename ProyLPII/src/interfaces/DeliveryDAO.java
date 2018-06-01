package interfaces;

import java.util.List;

import beans.ObjetoReporteDTO;
import beans.DeliveryDTO;

public interface DeliveryDAO {
	
	public int registrarDelivery(DeliveryDTO p);
	
	public List<DeliveryDTO> listarDelivery();
	
	public DeliveryDTO buscarDelivery(int cod);
	
	public int cantidadDelivery();
	
	public int actualizarTotalDelivery(int idped,double total);
	
 //	public DeliverysMonto listarMontos(int año);
	
	public List<ObjetoReporteDTO> listaPlatos();
	
	public double total();
	
	public int CancelarDelivery(int cod);
	
	public List<DeliveryDTO> listarDeliveryMesaEstado(int mesa);
	
	public int PagarDelivery(int cod);
	

}
