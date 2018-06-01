package dao;

import java.util.List;

import beans.DeliveryDTO;
import beans.ObjetoReporteDTO;
import interfaces.DeliveryDAO;

public class MYSQLDeliveryDAO implements DeliveryDAO {

	@Override
	public int registrarDelivery(DeliveryDTO p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DeliveryDTO> listarDelivery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeliveryDTO buscarDelivery(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadDelivery() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizarTotalDelivery(int idped, double total) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ObjetoReporteDTO> listaPlatos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CancelarDelivery(int cod) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DeliveryDTO> listarDeliveryMesaEstado(int mesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int PagarDelivery(int cod) {
		// TODO Auto-generated method stub
		return 0;
	}

}
