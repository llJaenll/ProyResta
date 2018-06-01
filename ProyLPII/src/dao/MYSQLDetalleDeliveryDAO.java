package dao;

import java.util.List;

import beans.DetalleDeliveryDTO;
import beans.MuestraDetalleDTO;
import interfaces.DetalleDeliveryDAO;

public class MYSQLDetalleDeliveryDAO implements DetalleDeliveryDAO {

	@Override
	public int registrar(DetalleDeliveryDTO dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizar(DetalleDeliveryDTO dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(DetalleDeliveryDTO dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MuestraDetalleDTO> buscarDetalleDelivery(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminarDeliverys(int idped) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalDelivery(int cod) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizarCancelacion(int idprod, int cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MuestraDetalleDTO> listarOrdenado(int ped) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalDeliveryEstado(int cod) {
		// TODO Auto-generated method stub
		return 0;
	}

}
