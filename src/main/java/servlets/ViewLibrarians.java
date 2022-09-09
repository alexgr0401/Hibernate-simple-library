package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.Librarian;
import sql.SqlConnection;

@WebServlet("/ViewLibrarians")
public class ViewLibrarians extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewLibrarians() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext servletContext = getServletContext();

		List<Librarian> librarians = null;

		try {
			librarians = SqlConnection.getAllLibrarians();
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		request.setAttribute("librarians", librarians);

		servletContext.getRequestDispatcher("/viewLibrarians.jsp").include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
