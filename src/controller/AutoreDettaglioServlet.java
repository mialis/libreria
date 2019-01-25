package controller; 
 
import java.io.IOException; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
import model.Autore; 
import service.ServiceFactory; 
 
/** 
 * Servlet implementation class AutoreDettaglioServlet 
 */ 
@WebServlet("/AutoreDettaglioServlet") 
public class AutoreDettaglioServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L; 
 
	/** 
	 * @see HttpServlet#HttpServlet() 
	 */ 
	public AutoreDettaglioServlet() { 
		super(); 
	} 
 
	/** 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse 
	 *      response) 
	 */ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException { 
		
		int id=Integer.parseInt(request.getParameter("id")); 
		Autore autore=ServiceFactory.getAutoreService().get(id); 
		request.setAttribute("id", id); 
		request.setAttribute("autore", autore); 
		request.getRequestDispatcher("/WEB-INF/AutoreDettaglio.jsp").forward(request, response); 
 
	} 
 
	/** 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
	 *      response) 
	 */ 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException { 
		// TODO Auto-generated method stub 
		doGet(request, response); 
	} 
 
} 