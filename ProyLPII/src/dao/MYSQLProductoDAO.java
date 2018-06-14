package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.ProductoDTO;
import interfaces.ProductoDAO;
import utils.MySQLConexion;

public class MYSQLProductoDAO implements ProductoDAO {

	@Override
	public int registrar(ProductoDTO p, String ruta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int codigo) {
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "{call usp_EliminarProducto(?)}";
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, codigo);
			rs = pst.executeUpdate();
		}catch(Exception e){
			System.out.println("Error en la sentencia => "+e.getMessage());  
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			} catch (SQLException e2) {
				System.out.println("Error al cerrar");
			}
		}
		return rs;
	}

	@Override
	public int modificar(ProductoDTO p, String ruta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductoDTO> listadoProducto() {
		ArrayList<ProductoDTO> lista = new ArrayList<ProductoDTO>();
		ResultSet rs=null;
		Connection con =null;
		PreparedStatement pst=null;
		try {
			con=MySQLConexion.getConexion();
			String sql="{call usp_listarProducto()}";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				ProductoDTO p = new ProductoDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5), rs.getInt(6),rs.getString(7));
				
				lista.add(p);
			}
		} catch (Exception e) {
			System.out.println("Error en la consulta" +e.getMessage());
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				System.out.println("error al cerrar");
			}
		}
		return lista;
	}

	@Override
	public ProductoDTO buscarProducto(String des) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO buscarProductoCod(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ProductoDTO> getImagenes(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDTO> listarxCategoria(int cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDTO> listarxStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDTO> listarProdMasVendidos(int cat) {
		// TODO Auto-generated method stub
		return null;
	}

}
