package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import beans.DetalleDeliveryDTO;
import beans.MuestraDetalleDTO;
import interfaces.DetalleDeliveryDAO;
import utils.MySQLConexion;

public class MYSQLDetalleDeliveryDAO implements DetalleDeliveryDAO {

	@Override
	public int registrar(DetalleDeliveryDTO dp) {
		Connection con = null;
		PreparedStatement pst = null;
		int rs = 0;
		try {
			con = MySQLConexion.getConexion();
			String sql = "{call usp_InsertarDetalleDelivery(?,?,?,?)}";
			pst = con.prepareStatement(sql);
			pst.setInt(1, dp.getidDelivery());
			pst.setInt(2, dp.getIdProducto());
			pst.setInt(3, dp.getCantidad());
			pst.setDouble(4, dp.getPrecioProducto());
			rs = pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("Error en la consulta " + e.getMessage());
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}

		return rs;
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
