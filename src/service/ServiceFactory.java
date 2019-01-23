package service;

import service.impl.LibroService;

public class ServiceFactory {
	
	private static final ILibroService LIBROSERVICE = new LibroService();

	public static ILibroService getLibroService() {
		return LIBROSERVICE;
	}
	
	

}
