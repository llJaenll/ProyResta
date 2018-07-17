package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.CategoriaDTO;
import interfaces.CategoriaDAO;
import utils.MySQLConexion;

public class MYSQLCategoriaDAO implements CategoriaDAO {

	@Override
	public int registrar(CategoriaDTO c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificar(CategoriaDTO c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CategoriaDTO> listarCategoria() {
		ArrayList<CategoriaDTO> lista = new ArrayList<CategoriaDTO>();
		ResultSet rs=null;
		Connection con =null;
		PreparedStatement pst=null;
		try {
			con=MySQLConexion.getConexion();
			String sql="select * from tipo_categoria";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				CategoriaDTO c = new CategoriaDTO(rs.getInt(1), rs.getString(2));
				lista.add(c);
			}
		} catch (Exception e) {
			System.out.println("Error en la consulta listar  categoria " +e.getMessage());
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

}
