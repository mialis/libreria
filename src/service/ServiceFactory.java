package service;

import service.impl.LibroService;

public class ServiceFactory {
	
	private static final ILibroService LIBRO_SERVICE = new LibroService();

	public static ILibroService getLibroService() {
		return LIBRO_SERVICE;
	}
	
	

}
