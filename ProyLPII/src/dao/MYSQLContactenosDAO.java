package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.ContactenosDTO;
import interfaces.ContactenosDAO;
import utils.MySQLConexion;

public class MYSQLContactenosDAO implements ContactenosDAO {

	@Override
	public int registrar(ContactenosDTO cn) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst=null;
		int rs =0;		
		try {
			con=MySQLConexion.getConexion();
			String sql="insert into contactenos values(null,?,?,?,?)";
			pst=con.prepareStatement(sql);
			
			pst.setString(1, cn.getNombre_contactenos());
			pst.setString(2, cn.getCorreo_contactenos());
			pst.setString(3, cn.getTelefono_contactenos());
			pst.setString(4, cn.getMensaje_contactenos());
					
			rs = pst.executeUpdate();
		} catch (Exception e) {		
			System.out.println("Error en la sentencia Insertar contactenos"+e.getMessage());
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

}
