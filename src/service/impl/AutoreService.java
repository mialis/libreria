package service.impl;

import java.util.List;

import dao.impl.AutoreDao;
import model.Autore;
import service.IAutoreService;

public class AutoreService implements IAutoreService {
	
	AutoreDao autoreDao = new AutoreDao();
	
	public List<Autore> getAll() {
		return autoreDao.getAll();
	}

	@Override
	public Autore get(int autoreId) {
		return autoreDao.get(autoreId);
	}
	
	public boolean create(Autore autore) { 
		boolean esisteGia = false; 
		for (Autore a : autoreDao.getAll()) { 
			if (a.getNome().equals(autore.getNome()) && a.getCognome().equals(autore.getCognome())) { 
				esisteGia = true; 
			} 
		} 
		if (!esisteGia) { 
			autoreDao.createAutore(autore); 
			return true; 
		} 
		return false; 
	} 
 
	@Override 
	public void update(Autore autore) { 
		boolean esisteGia = false; 
		for (Autore a : autoreDao.getAll()) { 
			if (a.getNome().equals(autore.getNome()) && a.getCognome().equals(autore.getCognome())) { 
				esisteGia = true; 
			} 
		} 
		if (!esisteGia) { 
			autoreDao.updateAutore(autore); 
		} 
	} 
 
	@Override 
	public void delete(int id) { 
		autoreDao.deleteAutore(id); 
	} 

}
