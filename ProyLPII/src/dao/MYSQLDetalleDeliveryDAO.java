package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.DeliveryDTO;
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
	public List<DetalleDeliveryDTO> listarOrdenado(String fecha1,String fecha2) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<DetalleDeliveryDTO> lista = new ArrayList<DetalleDeliveryDTO>();
		try {
			con=MySQLConexion.getConexion();
			String sql="{call usp_DeliveryPorFecha(?,?)}";
			pst=con.prepareStatement(sql);
			pst.setString(1, fecha1);
			pst.setString(2, fecha2);
			rs=pst.executeQuery();
			while(rs.next()){
				DetalleDeliveryDTO dd = new DetalleDeliveryDTO();
				dd.setNombre(rs.getString(1));
				dd.setPrecioProducto(rs.getDouble(2));
				dd.setCantidad(rs.getInt(3));
				dd.setSubtotal(rs.getDouble(4));
				lista.add(dd);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	@Override
	public int totalDeliveryEstado(int cod) {
		// TODO Auto-generated method stub
		return 0;
	}

}
