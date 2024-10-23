public class StringCreator{
	public static void main(String[] args) {
		String animal = "Donkey";
		String month = "April";
		String festival = "Holi";
		String name = "Saniha";
		String flower = "daisy";
		String state = "goa";
		String food = "Beriyani";
		String campanyName = "Xworkz";
		String temple = "Kateel";
		String season = "Winter";

		String Animal = new String("Donkey");
		String month1 = new String("April");
		String Festival = new String("Deepavali");
		String Fame = new String("Nayana");
		String Flower = new String("Rose");
		String State = new String("goa");
		String Food = new String("Upma");
		String CampanyName = new String("Xworkz");
		String Temple = new String("Kateel");
		String Season = new String("Summer");

		System.out.println(month.equals(month1));
		System.out.println(animal.equals(Animal));
		System.out.println(festival.equals(Festival));
		System.out.println(season.equals(Season));


		char[] charArray = animal.toCharArray();

		for(int i = 0 ; i < charArray.length ; i++)
		{

			System.out.print(charArray[i]);
		}

		System.out.println("");


		for(int i = charArray.length-1 ; i>=0 ; i--)
		{

			System.out.print(charArray[i]);

		}

		
	}
}