public class Runner{
	
	public static void main(String[] args) {
		
		Television television= new Television();

		television.name = "Samsung";
        television.price = 50000;
        television.color = "Black";
        television.screenSize = 10.1f;
        television.model = "r145";
        television.battary = 1000;

       
        System.out.println("Method Inherits");
        television.provideEntariement();

        System.out.println("");
        System.out.println("name: " + television.name);
        System.out.println("price: " + television.price);
        System.out.println("color: " + television.color);
        System.out.println("screensize: " + television.screenSize );
        System.out.println("Model : " + television.model);
        System.out.println("battary: " + television.battary);
	}
}