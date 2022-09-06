package library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "department_name")
	private String name;

	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addLibrarian(Librarian lib) {
		Librarian librarian = null;
//		librarians.add(librarian);

	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}