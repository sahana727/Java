public class Biker15{

	static String brandName;
	static String fuelType;
	static int noOfWheels;
	int speed;
	String color;
	int noOfSeats;
	String model;

	static{

		System.out.println("Static Block Executed");
		brandName = "r15";
		fuelType = "petrol";
		noOfWheels = 2;

	}

	public Biker15(int speed , String color , int noOfSeats , String model){

		this.speed = speed;
		this.color = color;
		this.noOfSeats = noOfSeats;
		this.model = model;

	}

	public void printDetails(){

		System.out.println("Brand Name: "+brandName);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("No of Wheel: "+noOfWheels);
		System.out.println("Speed: "+speed);
		System.out.println("Color: "+color);
		System.out.println("no Of Seats: "+noOfSeats);
		System.out.println("Model: "+model);
		
	}

	
	public static void main(String[] args) {

		Biker15 bike1 = new Biker15(150 , "Black" , 2 , "V4");
		Biker15 bike2 = new Biker15(100 , "Red" , 1 , "R54");
		Biker15 bike3 = new Biker15(170 , "Blue" , 1 , "b87");
		Biker15 bike4 = new Biker15(150 , "Red" , 2 , "V15");
		Biker15 bike5 = new Biker15(200 , "White" , 2 , "B23");

		bike1.printDetails();
		System.out.println("-----------------------------");
		bike2.printDetails();
		System.out.println("-----------------------------");
		bike3.printDetails();
		System.out.println("-----------------------------");
		bike4.printDetails();
		System.out.println("-----------------------------");
		bike5.printDetails();
		System.out.println("-----------------------------");
		
	}

}

class Mobile{

	static String brandName;
	static String battary;
	static int volumnButton;
	int noOfSencer;
	String color;
	int ram;
	String model;

	static{

		System.out.println("Static Block Executed");
		brandName = "Redmi";
		battary = 100;
		volumnButton = 2;

	}

	public Mobile(int noOfSencer , String color , int ram , String model){

		this.noOfSencer = noOfSencer;
		this.color = color;
		this.ram = ram;
		this.model = model;

	}

	public void printDetails(){

		System.out.println("Brand Name: "+brandName);
		System.out.println("battary: "+battary);
		System.out.println("volumn Button: "+volumnButton);
		System.out.println("no Of Sencer: "+noOfSencer);
		System.out.println("Color: "+color);
		System.out.println("ram: "+ram);
		System.out.println("Model: "+model);
		
	}

	
	public static void main(String[] args) {

		Mobile mobile1 = new Mobile(2 , "Black" , 250 , "V4");
		Mobile mobile2 = new Mobile(1 , "red" , 164 , "R54");
		Mobile mobile3 = new Mobile(3 , "Blue" , 256 , "B23");
		Mobile mobile4 = new Mobile(2 , "White" , 64 , "R50");
		Mobile mobile5 = new Mobile(4 , "Black" , 160 , "V12");

		mobile1.printDetails();
		System.out.println("-----------------------------");
		mobile2.printDetails();
		System.out.println("-----------------------------");
		mobile3.printDetails();
		System.out.println("-----------------------------");
		mobile4.printDetails();
		System.out.println("-----------------------------");
		mobile5.printDetails();
		System.out.println("-----------------------------");
		
	}

}

class Laptop{

	static String brandName;
	static String opertaingSystem;
	static int touchPad;
	int storage;
	String color;
	int ram;
	String model;

	static{

		System.out.println("Static Block Executed");
		brandName = "Dell";
		opertaingSystem = "Windows";
		touchPad = 1;

	}

	public Laptop(int storage , String color , int ram , String model){

		this.storage = storage;
		this.color = color;
		this.ram = ram;
		this.model = model;

	}

	public void printDetails(){

		System.out.println("Brand Name: "+brandName);
		System.out.println("opertaing System: "+opertaingSystem);
		System.out.println("touch Pad: "+touchPad);
		System.out.println("Storage: "+storage);
		System.out.println("Color: "+color);
		System.out.println("ram: "+ram);
		System.out.println("Model: "+model);
		
	}

	
	public static void main(String[] args) {

		Laptop laptop1 = new Laptop(457 , "Black" , 250 , "V4");
		Laptop laptop2 = new Laptop(156 , "red" , 164 , "R54");
		Laptop laptop3 = new Laptop(365 , "Blue" , 256 , "B23");
		Laptop laptop4 = new Laptop(234 , "White" , 64 , "R50");
		Laptop laptop5 = new Laptop(415 , "Black" , 160 , "V12");

		laptop1.printDetails();
		System.out.println("-----------------------------");
		laptop2.printDetails();
		System.out.println("-----------------------------");
		laptop3.printDetails();
		System.out.println("-----------------------------");
		laptop4.printDetails();
		System.out.println("-----------------------------");
		laptop5.printDetails();
		System.out.println("-----------------------------");
		
	}

}

public class Vehicle {
 
    

    static String manufacturer;
    static int wheels;
    static String fuelType;

    String model;
    VehicleType type;
    double price; 
    boolean hasAirConditioning;

    static {
        manufacturer = "AutoCorp";
        wheels = 4; 
        fuelType = "Gasoline"; 
    }

    public Vehicle(String model, VehicleType type, double price, boolean hasAirConditioning) {
        this.model = model;
        this.type = type;
        this.price = price;
        this.hasAirConditioning = hasAirConditioning;
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Wheels: " + wheels);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Model: " + model);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Has Air Conditioning: " + hasAirConditioning);
       
    }
}



