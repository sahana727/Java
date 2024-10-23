public class BookInfo{

	static Book[] bookdata = new Book[10];
	
	public static void main(String[] args){

		Book book1 = new Book("Godaan","Premchand",544,1000);
		Book book2 = new Book("half girlfriend","chetan bhagat",209,570);
		Book book3 = new Book("Karvalo","kuvempu",999,1500);
		Book book4 = new Book("'The Guide","R.K.narayan",250,1000);
		Book book5 = new Book("Sonnet","William Shekespeare",1600,1999);
		Book book6 = new Book("2 States","Chethan",650,500);
		Book book7 = new Book("namma mane","kevempu",260,999);
		Book book8 = new Book("Jugari cross","thejasvi",500,1600);

		saveBook(book1);
		saveBook(book2);
		saveBook(book3);
		saveBook(book4);
		saveBook(book5);
		saveBook(book6);
		saveBook(book7);
		saveBook(book8);
		


		for(int i = 0; i < bookdata.length; i++){
			if(bookdata[i]!=null){
				bookdata[i].bookDetails();
			}
		}
        
        System.out.println("---------------------------------------");
		Book foundbook = findByName("Sonnet");
		Book foundbook2 = findByName("2 States");
		if(foundbook != null){
			foundbook.bookDetails();
		    foundbook2.bookDetails();
		}
		System.out.println("---------------------------------------");
        updatePriceBybookName("namma book",900);
        updatePriceBybookName("jaanu",550);

		for(int i = 0; i < bookdata.length; i++){
			if(bookdata[i]!=null){
				bookdata[i].bookDetails();
			}
		}	
	}

	public static boolean saveBook(Book book){

		for(int i = 0; i < bookdata.length; i++){
			if(bookdata[i]==null){
				bookdata[i] = book;
				System.out.println("book is saved");
				return true;
			}
		}
        System.out.println("No space in array");
			return false;
    }
	
	public static Book findByName(String bookName) {
    for (int i = 0; i < bookdata.length; i++) {
        if (bookdata[i] != null) {
            if (bookdata[i].bookName.equals(bookName)) {
                System.out.println("Book found");
                return bookdata[i];
            }
        }
    }
    System.out.println("Book not found");
    return null; // Return null if the book is not found
}

	    public static boolean updatePriceBybookName(String bookName,int price){
		    for(int i=0;i<bookdata.length;i++){
			    if(bookdata[i]!= null){
				   if(bookdata[i].bookName.equals(bookName)){
				       bookdata[i].price = price;
		               System.out.println("price updated"); 
	                   return true;	
	               }
                }
            }
            System.out.println("not found");
	         return false;
        }
    
}        
