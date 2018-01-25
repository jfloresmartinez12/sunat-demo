package lu.lllc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBookAndAuthor
 */
@WebServlet("/AddCitaLinea")
public class AddCitaLinea extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCitaLinea() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String numRuc;
		String tipoContribuyente;
		String tipoDocumento;
		String domicilioFiscal;
		
		try {
			numRuc = request.getParameter("numRuc");
			tipoContribuyente = request.getParameter("tipoContribuyente");
			tipoDocumento = request.getParameter("tipoDocumento");
			domicilioFiscal = request.getParameter("domicilioFiscal");
			
		} catch (Exception e) {
			System.out.println( e.getStackTrace() );
			RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/wrongParameterError.html");
			disp.forward(request, response);
			return;
		}
		
		DBTools dbTools = new DBTools();
		
		dbTools.addContribuyente(numRuc, tipoContribuyente, tipoDocumento, domicilioFiscal);
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/addingCita.jsp");
		disp.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
