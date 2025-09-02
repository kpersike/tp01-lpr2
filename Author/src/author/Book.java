/*
 Nome: Kaik Persike Maiorquino
 Prontuário: CB3029689
 
 Nome: Matheus Penteado
 Prontuário: CB3031501
*/

package author;

public class Book {
	private String name;
	Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		String classesAuthor = "";
		
		for(int i = 0; i < authors.length; i++) {
			classesAuthor += ", " + authors[i].toString();
		}
		return "Book[name=" + this.name + ",authors={" + classesAuthor + "},price=" + this.price + ",qty=" + this.qty;
	}
	
	public String getAuthorNames() {
		String authorsName = "";
		for(int i = 0; i < authors.length; i++) {
			authorsName += ", " + authors[i].getName();
		}
		
		return authorsName;
	}
}
