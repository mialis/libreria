package service;

import service.impl.AutoreService;
import service.impl.LibroService;

public class ServiceFactory {
	
	private static final ILibroService LIBRO_SERVICE = new LibroService();
	public static final IAutoreService AUTORE_SERVICE = new AutoreService() ;

	public static ILibroService getLibroService() {
		return LIBRO_SERVICE;
	}
	
	public static IAutoreService getAutoreService() {
		return AUTORE_SERVICE;
	}
	

}
