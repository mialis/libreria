package controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Autore;
import service.ServiceFactory;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    response.setContentType("text/csv");
		    response.setHeader("Content-Disposition", "attachment; filename=\"userDirectory.csv\"");
		    try
		    {
		        OutputStream outputStream = response.getOutputStream();
		        PrintWriter printWriter = new PrintWriter(outputStream, true);
		        for(Autore autore : ServiceFactory.getAutoreService().getAll()) {
		        	printWriter.append(Integer.toString(autore.getId()));
		        	printWriter.append(",");
		        	printWriter.append(autore.getNome());
		        	printWriter.append(",");
		        	printWriter.append(autore.getCognome());
		        }
		       
		    }
		    catch(Exception e)
		    {
		        System.out.println(e.toString());
		    }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
