package service;

import java.util.List;

import model.Autore;

public interface IAutoreService {
	
	List<Autore> getAll();
	Autore get(int autoreId);
}
