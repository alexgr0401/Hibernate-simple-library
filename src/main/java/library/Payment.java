package library;
//package levelup;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "payment")
//public class Payment {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//
//	@OneToMany
//	@JoinColumn(name = "payment_id")
//	private List<Member> member = new ArrayList<>();
//
//	@OneToMany
//	@JoinColumn(name = "payment_id")
//	private List<Librarian> librarian = new ArrayList<>();
//
//	@Column(name = "amount")
//	private int amount;
//
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private String paymentDate;
//
//	@Column(name = "penalty")
//	private int penalty;
//
//	public Payment() {
//	}
//
//	public Payment(List<Member> member, List<Librarian> librarian, int amount, int penalty) {
//		this.member = member;
//		this.librarian = librarian;
//		this.amount = amount;
//		this.penalty = penalty;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public List<Member> getMember() {
//		return member;
//	}
//
//	public void setMember(List<Member> member) {
//		this.member = member;
//	}
//
//	public List<Librarian> getLibrarian() {
//		return librarian;
//	}
//
//	public void setLibrarian(List<Librarian> librarian) {
//		this.librarian = librarian;
//	}
//
//	public int getAmount() {
//		return amount;
//	}
//
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
//
//	public String getPaymentDate() {
//		return paymentDate;
//	}
//
//	public void setPaymentDate(String paymentDate) {
//		this.paymentDate = paymentDate;
//	}
//
//	public int getPenalty() {
//		return penalty;
//	}
//
//	public void setPenalty(int penalty) {
//		this.penalty = penalty;
//	}
//
//	@Override
//	public String toString() {
//		return "Payment [id=" + id + ", member=" + member + ", librarian=" + librarian + ", amount=" + amount
//				+ ", paymentDate=" + paymentDate + ", penalty=" + penalty + "]";
//	}
//}
