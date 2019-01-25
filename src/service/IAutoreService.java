package service;

import java.util.List;

import model.Autore;

public interface IAutoreService {
	
	List<Autore> getAll();
	Autore get(int autoreId);
	boolean create(Autore autore); 
	void update(Autore autore); 
	void delete(int id); 
	
	 
	 
	 
}

