package service.impl;

import java.util.List;

import dao.impl.LibroDao;
import model.Libro;
import service.ILibroService;

public class LibroService implements ILibroService{

	LibroDao libroDao = new LibroDao();
	
	public void create(String titolo, String descrizione) {
		Libro libro = new Libro(titolo, descrizione);
		boolean alreadyExist = false;
		for(Libro l : libroDao.getAllLibri()) {
			if(l.getTitolo().equalsIgnoreCase(libro.getTitolo())) {
				alreadyExist = true;
			} 
		}
		if (!alreadyExist) {
			libroDao.createLibro(libro);
		}
	}

	public List<Libro> getAll() {
		return libroDao.getAllLibri();
	}

	@Override
	public void update(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Libro libro) {
		// TODO Auto-generated method stub
		
	}
}
