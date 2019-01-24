package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IAutoreDao;
import model.Autore;
import model.Libro;

public class AutoreDao extends AbstractDao implements IAutoreDao {
	
private static final String CREATE_AUTORE = "INSERT INTO autore (nome, cognome) VALUES (?,?)";
	
    private static final String READ_AUTORE = "SELECT * FROM autore WHERE id = ?";

    private static final String READ_ALL_AUTORI = "SELECT * FROM autore";
    
    private static final String UPDATE_AUTORE = "UPDATE autore SET nome=? , cognome=? WHERE id = ?";
    
    private static final String DELETE_AUTORE = "DELETE FROM autore WHERE id = ?";

	@Override
	public List<Autore> getAll() {
		
		List<Autore> result = new ArrayList<>();

        try (
                Connection c = getConnection();
                PreparedStatement ps = c.prepareStatement(READ_ALL_AUTORI);
                ResultSet rs = ps.executeQuery();
            ) {        	
            while (rs.next()) {
                Autore r = new Autore(rs.getString("nome"), rs.getString("cognome"));
                r.setAutoreId(rs.getInt("id"));
                result.add(r);
            }   
            } catch (Exception e) {
            e.printStackTrace();
        }        
        return result;
	}

	@Override
	public void createAutore(Autore autore) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAutore(Autore autore) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAutore(int autoreId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Autore get(int autoreId) {
		Autore autore = null;
		ResultSet rs = null;
		try(
				Connection c = getConnection();
				PreparedStatement ps = c.prepareStatement(READ_AUTORE);				
			) {
			ps.setInt(1, autoreId);
			rs = ps.executeQuery();
			if (rs.next() && rs!=null) {
				autore = new Autore (rs.getString("nome"), rs.getString("cognome"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs!=null) {        	
	            try {	
	                rs.close();	
	            } catch (SQLException e) {	
	                e.printStackTrace();	
	            }	
	        }	
		}		
		return autore;
	}
	
	

}
