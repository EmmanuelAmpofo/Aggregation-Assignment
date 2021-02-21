
public class Book {
	String name;
	Author author;
	double price;
	int quantity;
	
	Book(String name, Author author,double price,int quantity){
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		Author poff = new Author("Poff","asdfg@gmail.com","Male");
		
		Book text = new Book("Java Programming",poff,1.50,200);
		
		System.out.println(text.getName());
		System.out.println(text.getPrice());
		System.out.println(text.getQuantity());
		System.out.println(text.getAuthor());
		

	}

}
