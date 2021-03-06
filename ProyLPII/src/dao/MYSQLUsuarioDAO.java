package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import beans.TipoUsuarioDTO;
import beans.UsuarioDTO;
import interfaces.UsuarioDAO;
import utils.MySQLConexion;

public class MYSQLUsuarioDAO implements UsuarioDAO {

	@Override
	public int registrar(UsuarioDTO u) {
		Connection con = null;
		PreparedStatement pst=null;
		int rs =0;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="{call usp_InsertarUsuario(?,?,?,?,?,?,?,?)}";
			pst=con.prepareStatement(sql);
			
			pst.setInt(1, u.getTipoUsuario());
			pst.setString(2, u.getNombre());
			pst.setString(3, u.getApePat());
			pst.setString(4, u.getApeMat());
			pst.setString(5, u.getDni());
			pst.setString(6, u.getTelefono());
			pst.setString(7, u.getUsuario());
			pst.setString(8, u.getContraseña());
			
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
			String sql = "{call usp_EliminarUsuario(?)}";
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
	public int modificar(UsuarioDTO u) {
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "{call usp_ActualizarUsuario(?,?,?,?,?,?,?,?,?)}";
			pst = con.prepareStatement(sql);
			pst.setInt(1, u.getCodigo());
			pst.setInt(2, u.getTipoUsuario());
			pst.setString(3, u.getNombre());
			pst.setString(4, u.getApePat());
			pst.setString(5, u.getApeMat());
			pst.setString(6, u.getDni());
			pst.setString(7, u.getTelefono());
			pst.setString(8, u.getUsuario());
			pst.setString(9, u.getContraseña());
			
			rs = pst.executeUpdate();
			
		} catch (Exception e) {
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
	public List<UsuarioDTO> listadoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO validarUsuario(String nusuario, String contraseña) {
		ResultSet rs=null;
		Connection con =null;
		PreparedStatement pst=null;
		UsuarioDTO u=null;
		try {
			con=MySQLConexion.getConexion();
			String sql="{call usp_validarIngreso(?,?)}";
			pst=con.prepareStatement(sql);
			pst.setString(1, nusuario);
			pst.setString(2, contraseña);
			rs=pst.executeQuery();
			
			while(rs.next()){
				u = new UsuarioDTO(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), 
		                rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9), rs.getString(10), rs.getString(11));
	              
			}
		} catch (Exception e) {
			System.out.println("Error en la consulta de login" +e.getMessage());
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				System.out.println("error al cerrar");
			}
		}
		return u;
	}

	@Override
	public UsuarioDTO buscarUsuario(int codigo) {
		ResultSet rs=null;
		Connection con =null;
		PreparedStatement pst=null;
		UsuarioDTO u=null;
		try {
			con=MySQLConexion.getConexion();
			String sql="select * from usuario where id_usu=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, codigo);
			rs=pst.executeQuery();
			
			while(rs.next()){

				u= new UsuarioDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10), rs.getString(11));
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
		return u;
	}

	@Override
	public List<TipoUsuarioDTO> listarTipoUsuario() {
		List<TipoUsuarioDTO>lista=new ArrayList<TipoUsuarioDTO>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from Tipo_Usuario";
		    pst = con.prepareStatement(sql);
		    
		    rs = pst.executeQuery();
			
		    while(rs.next()){
		    	TipoUsuarioDTO tu = new TipoUsuarioDTO(rs.getInt(1),rs.getString(2));
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

	@Override
	public List<UsuarioDTO> listarUsuarioTipo() {
		List<UsuarioDTO>lista=new ArrayList<UsuarioDTO>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "{call usp_usuarioTipo()}";
		    pst = con.prepareStatement(sql);
		    
		    rs = pst.executeQuery();
			
		    while(rs.next()){
		    	UsuarioDTO u = new UsuarioDTO(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), 
		    			                rs.getString(6),rs.getString(7),rs.getString(8), rs.getString(9), rs.getString(10));
                lista.add(u);		    
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

	@Override
	public UsuarioDTO buscarUsuarioTipo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadUsuario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int validarDni(String dni) {
		// TODO Auto-generated method stub
		return 0;
	}

}
