package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.Librarian;

@WebServlet("/AddLibrarian")
public class AddLibrarian extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddLibrarian() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String departmentId = request.getParameter("department_id");
		String username = request.getParameter("username");

		Librarian librarian = new Librarian();
		librarian.setFirstName(firstName);
		librarian.setLastName(lastName);
//		librarian.setDepartment(null); // treba ispravka
		librarian.setUsername(username);
		librarian.setPassword(null);

		String add = request.getParameter("add");

		if (add != null && add.equals("true")) {
			String password = request.getParameter("password");
			librarian.setPassword(password);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
