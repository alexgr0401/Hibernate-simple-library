package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.Book;
import sql.SqlConnection;

@WebServlet("/ViewBooks")
public class ViewBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewBooks() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext servletContext = getServletContext();

		List<Book> books = null;

		try {
			books = SqlConnection.getAllBooks();
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		request.setAttribute("books", books);

		servletContext.getRequestDispatcher("/viewBooks.jsp").include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
