package service.impl;

import java.util.List;

import dao.impl.LibroDao;
import model.Libro;
import service.ILibroService;

public class LibroService implements ILibroService{

	LibroDao libroDao = new LibroDao();
	List<Libro> libri =  libroDao.getAllLibri();
	
	public void createLibro(String titolo, String descrizione) {
		Libro libro = new Libro(titolo, descrizione);
		boolean alreadyExist = false;
		for(Libro l : libri) {
			if(l.getTitolo().equalsIgnoreCase(libro.getTitolo())) {
				alreadyExist = true;
			} 
		}
		if (!alreadyExist) {
			libroDao.createLibro(libro);
		}
	}
}