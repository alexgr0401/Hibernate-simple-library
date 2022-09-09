package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sql.SqlConnection;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext servletContext = getServletContext();

		Map<String, String> librarians = null;

		try {
			librarians = SqlConnection.getUserPass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();

		writer.println("<head><title>Servlet Page</title><head>");
		writer.println("<body>");
		writer.println("<b>Library - Team 2</b>");
		writer.println("<br/>");

		String user = request.getParameter("user");
		String pass = request.getParameter("pass");

		if (librarians.containsKey(user)) {
			if (librarians.get(user).equals(pass)) {
				writer.println("Welcome, <b>" + user + "</b>!<br> <br>");
				if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
					servletContext.getRequestDispatcher("/adminHome.jsp").include(request, response);
				} else {
					servletContext.getRequestDispatcher("/librarianHome.jsp").include(request, response);
				}
			} else {
				writer.println("Password doesn't match!<br> <br>");
				servletContext.getRequestDispatcher("/index.jsp").include(request, response);
			}
		} else {
			writer.println("User <b>" + user + "</b> doesn't exists!<br> <br>");
			servletContext.getRequestDispatcher("/index.jsp").include(request, response);
		}

		writer.println("</body>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
