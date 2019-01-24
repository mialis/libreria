package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import service.ServiceFactory;

/**
 * Servlet implementation class LibroFormServlet
 */
@WebServlet("/LibroFormServlet")
public class LibroFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibroFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/LibroForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Libro libro = new Libro(request.getParameter("titolo"), request.getParameter("descrizione"), Integer.parseInt(request.getParameter("autore_id")));
		boolean check = ServiceFactory.getLibroService().create(libro);
		request.setAttribute("libro", libro);
		if(check) {
			request.getRequestDispatcher("/WEB-INF/CreazioneLibroSuccesso.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/CreazioneLibroInsuccesso.jsp").forward(request, response);
		}
		
	}

}
