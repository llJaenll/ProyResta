package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.DeliveryDTO;
import beans.ObjetoReporteDTO;
import interfaces.DeliveryDAO;
import service.DeliveryService;
import utils.MySQLConexion;

public class MYSQLDeliveryDAO implements DeliveryDAO {

	@Override
	public int registrarDelivery(DeliveryDTO p) {
		Connection con = null;
		PreparedStatement pst = null;
		int rs = 0;
		try {
			con = MySQLConexion.getConexion();
			String sql = "{call usp_InsertarDelivery(?,?,?,?,?,?,?)}";
			pst = con.prepareStatement(sql);
			pst.setInt(1, p.getIdDelivery());
			pst.setInt(2, p.getId_motor());
			pst.setString(3, p.getDir());
			pst.setString(4, p.getNomDel());
			pst.setString(5, p.getDniDel());
            pst.setString(6, p.getPagoDel());
            pst.setString(7, p.getObsDel());
			rs = pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("Error en la consulta Registrar delivery" + e.getMessage());
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
	public List<DeliveryDTO> listarDelivery() {
		List<DeliveryDTO> lista = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from Delivery";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				DeliveryDTO d = new DeliveryDTO();
				d.setIdDelivery(rs.getInt(1));
				d.setId_motor(rs.getInt(2));
				d.setDir(rs.getString(3));
				d.setFecha(rs.getString(4));
				d.setTotal(rs.getDouble(5));
				lista.add(d);
			}

		} catch (Exception e) {
			System.out.println("Error en la sentencia listarDelivery()" + e.getMessage());
		}finally{
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}

		return lista;
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

	@Override
	public int codigoCorrelativo() {
		DeliveryService ds = new DeliveryService();
		List<DeliveryDTO> listaDes = ds.listarDelivery();
		DeliveryDTO d;
		int cod;
		try {
			d = listaDes.get(listaDes.size() - 1);
			cod=d.getIdDelivery() + 1;
		} catch (Exception e) {
			cod=1;
		}
		return cod;
	}

}
