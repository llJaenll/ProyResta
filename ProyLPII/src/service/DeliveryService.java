package service;

import java.util.List;

import beans.DeliveryDTO;
import beans.ObjetoReporteDTO;
import dao.DAOFactory;
import interfaces.DeliveryDAO;

public class DeliveryService implements DeliveryDAO{

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	DeliveryDAO dao =  fabrica.getDeliveryDAO();
	
	@Override
	public int registrarDelivery(DeliveryDTO p) {
		// TODO Auto-generated method stub
		return dao.registrarDelivery(p);
	}

	@Override
	public List<DeliveryDTO> listarDelivery() {
		// TODO Auto-generated method stub
		return dao.listarDelivery();
	}

	@Override
	public DeliveryDTO buscarDelivery(int cod) {
		// TODO Auto-generated method stub
		return dao.buscarDelivery(cod);
	}

	@Override
	public int cantidadDelivery() {
		// TODO Auto-generated method stub
		return dao.cantidadDelivery();
	}

	@Override
	public int actualizarTotalDelivery(int idped, double total) {
		// TODO Auto-generated method stub
		return dao.actualizarTotalDelivery(idped, total);
	}

	@Override
	public List<ObjetoReporteDTO> listaPlatos() {
		// TODO Auto-generated method stub
		return dao.listaPlatos();
	}

	@Override
	public double total() {
		// TODO Auto-generated method stub
		return dao.total();
	}

	@Override
	public int CancelarDelivery(int cod) {
		// TODO Auto-generated method stub
		return dao.CancelarDelivery(cod);
	}

	@Override
	public List<DeliveryDTO> listarDeliveryMesaEstado(int mesa) {
		// TODO Auto-generated method stub
		return dao.listarDeliveryMesaEstado(mesa);
	}

	@Override
	public int PagarDelivery(int cod) {
		// TODO Auto-generated method stub
		return dao.PagarDelivery(cod);
	}

}
