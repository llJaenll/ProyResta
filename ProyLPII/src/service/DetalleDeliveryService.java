package service;

import java.util.List;

import beans.DetalleDeliveryDTO;
import beans.MuestraDetalleDTO;
import dao.DAOFactory;
import interfaces.DetalleDeliveryDAO;

public class DetalleDeliveryService implements DetalleDeliveryDAO{

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	DetalleDeliveryDAO dao =  fabrica.getDetalleDeliveryDAO();	
	
	@Override
	public int registrar(DetalleDeliveryDTO dp) {
		// TODO Auto-generated method stub
		return dao.registrar(dp);
	}

	@Override
	public int actualizar(DetalleDeliveryDTO dp) {
		// TODO Auto-generated method stub
		return dao.actualizar(dp);
	}

	@Override
	public int eliminar(DetalleDeliveryDTO dp) {
		// TODO Auto-generated method stub
		return dao.eliminar(dp);
	}

	@Override
	public List<MuestraDetalleDTO> buscarDetalleDelivery(int cod) {
		// TODO Auto-generated method stub
		return dao.buscarDetalleDelivery(cod);
	}

	@Override
	public int eliminarDeliverys(int idped) {
		// TODO Auto-generated method stub
		return dao.eliminarDeliverys(idped);
	}

	@Override
	public int totalDelivery(int cod) {
		// TODO Auto-generated method stub
		return dao.totalDelivery(cod);
	}

	@Override
	public int actualizarCancelacion(int idprod, int cantidad) {
		// TODO Auto-generated method stub
		return dao.actualizarCancelacion(idprod, cantidad);
	}

	@Override
	public List<MuestraDetalleDTO> listarOrdenado(int ped) {
		// TODO Auto-generated method stub
		return dao.listarOrdenado(ped);
	}

	@Override
	public int totalDeliveryEstado(int cod) {
		// TODO Auto-generated method stub
		return dao.totalDelivery(cod);
	}

}
