package sql;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import library.Author;
import library.Book;
import library.Department;
import library.Genre;
import library.Librarian;
import library.Member;
import library.Membership;
import library.Publisher;

public class SqlConnection {

	public static Session getSqlConnection() {

		Configuration conf = new Configuration().configure();
		conf.addAnnotatedClass(Librarian.class).addAnnotatedClass(Department.class).addAnnotatedClass(Book.class)
				.addAnnotatedClass(Author.class).addAnnotatedClass(Publisher.class).addAnnotatedClass(Genre.class)
				.addAnnotatedClass(Member.class).addAnnotatedClass(Membership.class);
		ServiceRegistry sreg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory sf = conf.buildSessionFactory(sreg);
		Session session = sf.openSession();

		return session;

	}

	public static Map<String, String> getUserPass() throws ClassNotFoundException {

		Map<String, String> userPass = new HashMap<String, String>();

		List<Object> data;

		Query q = getSqlConnection().createSQLQuery("SELECT username, password FROM librarian");

		data = q.list();

		String user = null;
		String pass = null;

		for (Iterator it = data.iterator(); it.hasNext();) {
			Object[] res = (Object[]) it.next();
			user = (String) res[0];
			pass = (String) res[1];
			userPass.put(user, pass);
		}
		return userPass;

	}

	public static List<Librarian> getAllLibrarians() {

		List<Librarian> librarians = new ArrayList<>();

		List<Object> data;

		Query q = getSqlConnection().createSQLQuery("SELECT * FROM librarian");

		data = q.list();

		Integer id = null;
		String firstName = null;
		String lastName = null;
		Integer departmentId = null;
		String username = null;
		String password = null;

		for (Iterator it = data.iterator(); it.hasNext();) {
			Object[] res = (Object[]) it.next();
			id = (Integer) res[0];
			firstName = (String) res[1];
			lastName = (String) res[2];
			departmentId = (Integer) res[3];
			username = (String) res[4];
			password = (String) res[5];

			Librarian librarian = new Librarian();
			librarian.setId(id);
			librarian.setFirstName(firstName);
			librarian.setLastName(lastName);
			librarian.setDepartmentId(departmentId);
			librarian.setUsername(username);
			librarian.setPassword(password);

			librarians.add(librarian);

		}
		return librarians;

	}

	public static List<Member> getAllMembers() {

		List<Member> members = new ArrayList<>();

		List<Object> data;

		Query q = getSqlConnection().createSQLQuery("SELECT * FROM member");

		data = q.list();

		Integer id = null;
		String firstName = null;
		String lastName = null;
		Date birthDate = null;
		String address = null;
		String city = null;
		Integer phone = null;
		Integer departmentId = null;

		for (Iterator it = data.iterator(); it.hasNext();) {
			Object[] res = (Object[]) it.next();
			id = (Integer) res[0];
			firstName = (String) res[1];
			lastName = (String) res[2];
			birthDate = (Date) res[3];
			address = (String) res[4];
			city = (String) res[5];
			phone = (Integer) res[6];
			departmentId = (Integer) res[8];

			Member member = new Member();
			member.setId(id);
			member.setFirstName(firstName);
			member.setLastName(lastName);
			member.setBirthDate(birthDate);
			member.setAddress(address);
			member.setCity(city);
			member.setPhone(phone);
			member.setDepartmentId(departmentId);

			members.add(member);

		}
		return members;

	}

	public static List<Book> getAllBooks() {

		List<Book> books = new ArrayList<>();

		List<Object> data;

		Query q = getSqlConnection().createSQLQuery("SELECT * FROM book");
		
		data = q.list();

		Integer id = null;
		String isbn = null;
		String title = null;
		String description = null;
		Integer publisherId = null;
		Integer releaseYear = null;

		for (Iterator it = data.iterator(); it.hasNext();) {
			Object[] res = (Object[]) it.next();
			id = (Integer) res[0];
			isbn = (String) res[1];
			title = (String) res[2];
			description = (String) res[3];			
			publisherId = (Integer) res[4];			
			releaseYear = (Integer) res[5];

			Book book = new Book();		
			book.setId(id);
			book.setIsbn(isbn);
			book.setTitle(title);
			book.setDescription(description);
			book.setPublisherId(publisherId);
			book.setReleaseYear(releaseYear);

			books.add(book);

		}
		return books;
		
	
		
		
			
		

//	private static DatabaseConnection INSTANCE;
//
//	private Connection connection;
//	private String url = PropertiesHelper.getUrl();
//	private String user = PropertiesHelper.getUser();
//	private String pass = PropertiesHelper.getPass();
//
//	private DatabaseConnection() {
//		try {
//			connection = DriverManager.getConnection(url, user, pass);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static DatabaseConnection getInstance() {
//		if (INSTANCE == null) {
//			synchronized (DatabaseConnection.class) {
//				if (INSTANCE == null) {
//					INSTANCE = new DatabaseConnection();
//				}
//			}
//		}
//		return INSTANCE;
//	}
//
//	public Connection getConnection() {
//		return connection;
	}

}
