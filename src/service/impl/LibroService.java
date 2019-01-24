package service.impl;

import java.util.List;

import dao.impl.LibroDao;
import model.Libro;
import service.ILibroService;

public class LibroService implements ILibroService{

	LibroDao libroDao = new LibroDao();
	
	public boolean create(Libro libro) {
		boolean alreadyExist = false;
		for(Libro l : libroDao.getAllLibri()) {
			if(l.getTitolo().equalsIgnoreCase(libro.getTitolo())) {
				alreadyExist = true;
				return false;
			} 
		}
		if (!alreadyExist) {
			libroDao.createLibro(libro);
		}
		return true;
	}

	public List<Libro> getAll() {
		return libroDao.getAllLibri();
	}

	@Override
	public void update(Libro libro) {
		libroDao.updateLibro(libro);
		
	}

	@Override
	public void delete(Libro libro) {
		libroDao.deleteLibro(libro);		
	}

}
