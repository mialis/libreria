package service;

import java.util.List;

import model.Libro;

public interface ILibroService {

	public boolean create(Libro libro);
	public void update(Libro libro);
	public void delete(Libro libro);
	List<Libro> getAll();
	
}
