package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


import beans.TipoUsuarioDTO;
import beans.UsuarioDTO;
import beans.UsuarioTipoDTO;
import interfaces.UsuarioDAO;
import utils.MySQLConexion;

public class MYSQLUsuarioDAO implements UsuarioDAO {

	@Override
	public int registrar(UsuarioDTO c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificar(UsuarioDTO c) {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoUsuarioDTO> listarTipoUsaurio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioTipoDTO> listarUsuarioTipo() {
		// TODO Auto-generated method stub
		return null;
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
