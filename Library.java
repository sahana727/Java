package com.xworkz.encapsulation;

public class Library {

	private int book_id;
	private String title;
  	private String author;
	private String publisher;
	private int publication_year;
	private String isbn;
	private String language;
	private String genre;
	private int pages;
	private int available_copies;
	private int total_copies;
	private String borrower_id;
	private int due_date;
	private int check_out_date;
	private int return_date;
	private boolean is_damaged;
	private boolean is_reserved;
	private int reservation_date;
	private int last_borrowed_date;
	private String location_in_library;
	
	public Library(int book_id,String title,String author,String publisher, int publication_year,String isbn,
			String language,String genre, int pages,int available_copies,int total_copies,String borrower_id,int due_date,
			int check_out_date,int return_date,boolean is_damaged,boolean is_reserved,int reservation_date,
			int last_borrowed_date,String location_in_library) {
		this.book_id = book_id;
		this.author = author;
		this.publisher = publisher;
		this.publication_year = publication_year;
		this.isbn = isbn;
		this.language = language;
		this.genre = genre;
		this.pages = pages;
		this.available_copies = available_copies;
		this.total_copies = total_copies;
		this.borrower_id=borrower_id;
		this.due_date=due_date;
		this.check_out_date=check_out_date;
		this.return_date=return_date;
		this.is_damaged=is_damaged;
		this.is_reserved=is_reserved;
		this.reservation_date=reservation_date;
		this.last_borrowed_date=last_borrowed_date;
		this.location_in_library=location_in_library;
		
		
	}
	public int getbook_id(){
		System.out.println("Book id");
		return book_id;
	}
	
	public String getauthor(){
		System.out.println("Author");
		return author;
	}
	
	public String getpublisher(){
		System.out.println("Publisher");
		return publisher;
	}
	
	public int getpublication_year(){
		System.out.println("publication year");
		return publication_year;
	}
	
	public String getisbn(){
		System.out.println("Is bn");
		return isbn;
	}
	
	public String getlanguage(){
		System.out.println("Language");
		return language;
	}
	
	public String getgenre(){
		System.out.println("Genre");
		return genre;
	}
	
	public int getpages(){
		System.out.println("pages");
		return pages;
	}
	
	public int getavailable_copies(){
		System.out.println("Available copies");
		return available_copies;
	}
	
	public int gettotal_copies(){
		System.out.println("Total Copies");
		return total_copies;
	}

	public String getborrowed_id(){
		System.out.println("borrowed id");
		return borrowed_id;
	}
	
	public int getdue_date(){
		System.out.println("Due dates");
		return due_date;
	}
	
	public int getcheck_out_date(){
		System.out.println("check out dates");
		return check_out_date;
	}
	
	public int getreturn_date(){
		System.out.println("Return date");
		return return_date;
	}
	
	public boolean getis_damaged(){
		System.out.println("Is damged");
		return is_damaged;
	}
	
	public boolean getis_reserved(){
		System.out.println("Is reserved");
		return is_reserved;
	}
	
	public int getreservation_date(){
		System.out.println("Reservation date");
		return reservation_date;
	}
	
	public int getlast_borrowed_date(){
		System.out.println("last borrowed date");
		return last_borrowed_date;
	}
	
	public String getlocation_in_library(){
		System.out.println("location in library");
		return location_in_library;
	}
	
	public void setbook_id(int book_id){
		this.book_id = book_id;
	}
	
	public void setauthor(String author){
		this.author = author;
	}
	
	public void setpublisher(String publisher){
		this.publisher = publisher;
	}
	
	public void setpublication_year(int publication_year){
		this.publication_year = publication_year;
	}
	
	public void setisbn(String isbn){
		this.isbn = isbn;
	}
	
	public void setlanguage(String language){
		this.language = language;
	}
	
	public void setgenre(String genre){
		this.genre = genre;
	}
	
	public void setpages(int pages){
		this.pages = pages;
	}
	
	public void setavailable_copies(int available_copies){
		this.available_copies = available_copies;
	}
	
	public void settotal_copies(int total_copies){
		this.total_copies = total_copies;
	}

	public void setborrowed_id(String borrowed_id){
		this.borrower_id=borrower_id;
	}
	
	public void setdue_date(int due_date){
		this.due_date=due_date;
	}
	
	public void setcheck_out_date(int check_out_date){
		this.check_out_date=check_out_date;
	}
	
	public void setreturn_date(int return_date){
		this.return_date=return_date;
	}
	
	public void setis_damaged(boolean is_damaged){
		this.is_damaged=is_damaged;
	}
	
	public void setis_reserved( boolean is_reserved){
		this.is_reserved=is_reserved;
	}
	
	public void setreservation_date(int reservation_date){
		this.reservation_date=reservation_date;
	}
	
	public void setlast_borrowed_date(int last_borrowed_date){
		this.last_borrowed_date=last_borrowed_date;
	}
	
	public void setlocation_in_library( String location_in_library){
		this.location_in_library=location_in_library;
	}
	
}
