package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.CategoriaDTO;
import beans.ProductoDTO;
import beans.TipoUsuarioDTO;
import interfaces.ProductoDAO;
import utils.MySQLConexion;

public class MYSQLProductoDAO implements ProductoDAO {

	@Override
	public int registrar(ProductoDTO p) {
		Connection con = null;
		PreparedStatement pst=null;
		int rs =0;
		
		try {
			
			con=MySQLConexion.getConexion();
			String sql="{call usp_InsertarProducto(?,?,?,?)}";
			pst=con.prepareStatement(sql);
			
			pst.setInt(1, p.getTipoCategoria());
			pst.setString(2, p.getDescripcion());
			pst.setDouble(3, p.getPrecio());
			pst.setInt(4, p.getStock());
			
			rs = pst.executeUpdate();
			
		
		} catch (Exception e) {
			
			System.out.println("Error en la sentencia"+e.getMessage());
		}finally{
			try {
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				System.out.println("Error al cerrar");
			}
		}
		
		return rs;
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
	public int modificar(ProductoDTO p) {
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
		ArrayList<ProductoDTO> lista = new ArrayList<ProductoDTO>();
		ResultSet rs=null;
		Connection con =null;
		PreparedStatement pst=null;
		try {
			con=MySQLConexion.getConexion();
			String sql="select * from producto where id_TipoCat=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, cat);
			rs=pst.executeQuery();
			
			while(rs.next()){
				ProductoDTO p = new ProductoDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getInt(5), rs.getInt(6),rs.getString(7));
				lista.add(p);
			}
		} catch (Exception e) {
			System.out.println("Error en la consulta listar por categoria " +e.getMessage());
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
	public List<ProductoDTO> listarxStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDTO> listarProdMasVendidos(int cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoriaDTO> listarTipoProducto() {
		List<CategoriaDTO>lista=new ArrayList<CategoriaDTO>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from Tipo_Categoria";
		    pst = con.prepareStatement(sql);
		    
		    rs = pst.executeQuery();
			
		    while(rs.next()){
		    	CategoriaDTO tu = new CategoriaDTO(rs.getInt(1),rs.getString(2));
                lista.add(tu);		    
		    }
		    
		} catch (Exception e) {
			System.out.println("Error a la sentencia => "+e.getMessage());
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			} catch (SQLException e2) {
				System.out.println("Error al cerrar");
			}
		}
	
		return lista;
	}

}
