public class Camera{
	String brandName;
    float screen;
	int battery;
	String typeOfLens;
	int price;

    public Camera(){
        System.out.println("without parameter");
    }

    public Camera(String brandName,float screen,int battery,String typeOfLens,int price){

        this.brandName = brandName;
        this.screen = screen;
        this.battery = battery;
        this.typeOfLens = typeOfLens;
        this.price = price;
    }


  public static void captureImage(){

  }
  public static void openPhotos(){

  }
  public static void recordvedio(){

  }
  public static void focus(){

  }
  

  public void cameraDetails(){

    System.out.println("Brand Name : "+brandName);
    System.out.println("screen size : "+screen);
    System.out.println("Battery : "+battery);
    System.out.println("Type of Lens : "+typeOfLens);
    System.out.println("Price : "+price);
    

  }
}