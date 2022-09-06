package library;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "ISBN")
	private String isbn;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "release_year")
	private int releaseYear;

	@Column(name = "quantity")
	private int quantity;

	@ManyToOne(targetEntity = Publisher.class)
	@JoinColumn(name = "publisher_id")
	private Publisher publisher;

	@Column(name = "publisher_id", insertable = false, updatable = false)
	private int publisherId;

	@ManyToMany(targetEntity = Author.class)
	@JoinColumn(name = "author_id")
	private List<Author> authors = new ArrayList<>();

	@ManyToMany(targetEntity = Genre.class)
	@JoinColumn(name = "genre_id")
	private List<Genre> genres = new ArrayList<>();

	@ManyToMany(targetEntity = Department.class)
	@JoinColumn(name = "department_id")
	private List<Department> departments = new ArrayList<>();

	public Book() {
	}

	public Book(String isbn, String title, String description, int releaseYear) {
		this.isbn = isbn;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void addGenre(Genre genre) {
		genres.add(genre);
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void addDepartment(Department department) {
		departments.add(department);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", description=" + description
				+ ", releaseYear=" + releaseYear + ", author=" + authors + ", department=" + departments + "]";
	}
}
