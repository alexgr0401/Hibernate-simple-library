package library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "membership")
public class Membership {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String category;
	private int price;

	public Membership() {
	}

	public Membership(String category, int price) {
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Membership [id=" + id + ", category=" + category + ", price=" + price + "]";
	}
}
