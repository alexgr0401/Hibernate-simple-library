package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import library.Author;
import library.Book;
import library.Department;
import library.Genre;
import library.Publisher;
import sql.SqlConnection;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddBook() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext servletContext = getServletContext();

		Session session = SqlConnection.getSqlConnection();

		Transaction tx = session.beginTransaction();

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();

		Author author = new Author();
		author.setFirstName(request.getParameter("first_name"));
		author.setLastName(request.getParameter("last_name"));
		session.save(author);

		Publisher publisher = new Publisher();
		publisher.setName(request.getParameter("publisher_name"));
		publisher.setCity(request.getParameter("city"));
		session.save(publisher);

		Genre genre = new Genre();
		genre.setName(request.getParameter("genre_name"));
		session.save(genre);

		Department department = new Department();
		department.setName(request.getParameter("department_name"));
		session.save(department);

		Book book = new Book();
		book.setIsbn(request.getParameter("isbn"));
		book.setTitle(request.getParameter("title"));
		book.setDescription(request.getParameter("description"));
		book.addAuthor(author);
		book.setPublisher(publisher);
		book.setReleaseYear(Integer.parseInt(request.getParameter("release_year")));
		book.addGenre(genre);
		book.addDepartment(department);
		book.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		session.save(book);

		tx.commit();

		writer.println("<b>Book Added Successfully!</b><br><br>");

		servletContext.getRequestDispatcher("/librarianHome.jsp").include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
