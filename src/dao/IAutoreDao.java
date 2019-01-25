package dao;

import java.util.List;

import model.Autore;

public interface IAutoreDao {
	
	public List<Autore> getAll();
	public Autore get(int autoreId);
	public void createAutore (Autore autore);
	public void updateAutore (Autore autore);
	public void deleteAutore(int autoreId);

}
