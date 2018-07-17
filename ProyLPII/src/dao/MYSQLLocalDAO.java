package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.MySQLConexion;
import beans.LocalDTO;
import interfaces.LocalDAO;

public class MYSQLLocalDAO implements LocalDAO{

	@Override
	public ArrayList<LocalDTO> listar() {
		ArrayList<LocalDTO> lista=new ArrayList<LocalDTO>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = MySQLConexion.getConexion();
			String sql = "Select * from Locales";
		    pst = con.prepareStatement(sql);
		    rs = pst.executeQuery();
			
		    while(rs.next()){
		    	LocalDTO l = new LocalDTO(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
                lista.add(l);
                System.out.println(lista);
		    }
		    
		} catch (Exception e) {
			System.out.println("Error a la sentencia listar locales => "+e.getMessage());
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
