public class Cameracam{
	
	String brandName;
	String lensType;
	int price;
	int battary;
	String model;

	public Cameracam(){
		System.out.println("No param constructor");

	}

	public Cameracam(String brandName){
		this();
		this.brandName = brandName;
	}

	public Cameracam(String brandName,String lensType){
		this(brandName);
		this.lensType = lensType;
	}

	public Cameracam(String brandName , String lensType , int price ){
		this(brandName,lensType);
		this.price = price;
	}

	public Cameracam(String brandName , String lensType , int price , int battary){
		this(brandName,lensType,price);
		this.battary = battary;


	}
 	
 	public Cameracam(String brandName , String lensType , int price , int battary,String model){

 		this(brandName,lensType,price,battary);
 		this.model=model;
 	}

 	public void printDetails(){
 		System.out.println("Brand Name = "+brandName);
 		System.out.println("Lens Type = "+lensType);
 		System.out.println("Price = "+price);
 		System.out.println("Battary = "+battary);
 		System.out.println("Model = "+model);
 	}

}