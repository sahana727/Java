public class ElectronicsRunner {
    public static void main(String[] args) {
        Television device = new Television();

        device.manufacturer = "Samsung";
        device.color = "Silver";
        device.price = 20000;
        device.operatingSystem = "Android";
        device.camera = 48;
        device.screenSize = 3.5f;       
        device.model = "R134";   
        device.battary = 6000;

        System.out.println("Manufacturer: " + device.manufacturer);
        System.out.println("color: " + device.color);
        System.out.println("price: " + device.price );
        System.out.println("Operating System: " + device.operatingSystem);
        System.out.println("Camera Resolution: " + device.camera);
        System.out.println("Display Size: " + device.screenSize );
        System.out.println("model: " + device.model);
        System.out.println("Battery Life: " + device.battary );
    }
}