public class CameraDetail{
	public static void main(String[] args){
		Camera camera=new Camera();
		camera.brandName="Nikon";
		camera.screen=2.5f;
		camera.battery=90;
		camera.typeOfLens="Macrolens";
		camera.price=8000;

		System.out.println("Brand name:" +camera.brandName);
		System.out.println("screenSize:" +camera.screen);
		System.out.println("battery:" +camera.battery);
		System.out.println("typeOfLens:" +camera.typeOfLens);
		System.out.println("price:" +camera.price);
		System.out.println("-----------------------------------");

		Camera camera1=new Camera();
		camera1.brandName="SonyAlpha";
		camera1.screen=3.0f;
		camera1.battery=75;
		camera1.typeOfLens="PrimeLens";
		camera1.price=119000;

		System.out.println("brand name:" +camera1.brandName);
		System.out.println("screenSize:" +camera1.screen);
		System.out.println("battery:" +camera1.battery);
		System.out.println("typeOfLens:" +camera1.typeOfLens);
		System.out.println("price:" +camera1.price);
		System.out.println("-----------------------------------");


		Camera camera2=new Camera();
		camera2.brandName="Nikon Z50";
		camera2.screen=2.5f;
		camera2.battery=100;
		camera2.typeOfLens="Telephotolens";
		camera2.price=63000;

		System.out.println("brand name:" +camera2.brandName);
		System.out.println("screenSize:" +camera2.screen);
		System.out.println("battery:" +camera2.battery);
		System.out.println("typeOfLens:" +camera2.typeOfLens);
		System.out.println("price:" +camera2.price);
		System.out.println("-----------------------------------");

		Camera camera3=new Camera();
		camera3.brandName="Canon";
		camera3.screen=3.0f;
		camera3.battery=50;
		camera3.typeOfLens="fisheyelens";
		camera3.price=3300;

		System.out.println("Brand name:" +camera3.brandName);
		System.out.println("screenSize:" +camera3.screen);
		System.out.println("battery:" +camera3.battery);
		System.out.println("typeOfLens:" +camera3.typeOfLens);
		System.out.println("price:" +camera3.price);
		System.out.println("-----------------------------------");

	}

}