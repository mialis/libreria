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

}
