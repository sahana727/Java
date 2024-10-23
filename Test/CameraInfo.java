public class CameraInfo{
	public static void main(String[] args){

		Camera camera = new Camera();

		Camera camera1 = new Camera("Nikon",2.3f,300,"primelens",50000);

		Camera camera2 = new Camera("canon",2.5f,500,"fisheyelens",45000);

		Camera camera3 = new Camera("Nikon Z50",3.0f,600,"macrolens",60000);

		camera.cameraDetails();
		System.out.println("----------------------------");

		camera1.cameraDetails();
		System.out.println("----------------------------");

		camera2.cameraDetails();
		System.out.println("----------------------------");

		camera3.cameraDetails();
		System.out.println("----------------------------");






	}
}