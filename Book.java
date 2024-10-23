public class Book{

	String bookName;
	String author;
	int price;
	int no_of_pages;

	public Book(){

		System.out.println("No param constructor");
	}

	public Book(String bookName,String author,int price,int no_of_pages){

		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.no_of_pages = no_of_pages;
	}

	public void bookDetails(){

		System.out.println("Book Name : "+bookName);
		System.out.println("author : "+author);
		System.out.println("price : "+price);
		System.out.println("no_of_pages : "+no_of_pages);
	}

}