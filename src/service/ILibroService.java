package service;

import java.util.List;

import model.Libro;

public interface ILibroService {

	public void create(String titolo, String descriozione);
	public void update(Libro libro);
	public void delete(Libro libro);
	List<Libro> getAll();
	
}
