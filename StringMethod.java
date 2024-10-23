public class StringMethod{

	public static void main(String[] args){

		//concatenation

		String Season = "Winter";
		String concatenateValue = Season.concat(" cold");
		System.out.println("Concatenation Operation");
		System.out.println(concatenateValue);
		System.out.println("---------------------------------------");

		//upper case

		String animal = "tiger";
		String convertToUpper = animal.toUpperCase();
		System.out.println("Upper Case");
		System.out.println(convertToUpper);
		System.out.println("---------------------------------------------");

		//lower case

		String name = "SHARANYA SHETTY";
		String convertToLower = name.toLowerCase();
		System.out.println("Lower case");
		System.out.println(convertToLower);
		System.out.println("-----------------------------------------------");


		//trim

		String food = "                Biriyani                  ";
		String trimedValue = food.trim();
		System.out.println("Trim");
		System.out.println(trimedValue);
		System.out.println("------------------------------------------------");



		//is empty

		String title = "";
		boolean emptyresult = title.isEmpty();
		System.out.println("Is Empty");
		System.out.println(emptyresult);
		System.out.println("------------------------------------------------");


		//length

		String temple = "kateel";
		int lengthOfString = temple.length();
		System.out.println("length");
		System.out.println(lengthOfString);
		System.out.println("----------------------------------------------");



		//split(string regex)

		String fullName = "Sahana S shetty";
		String[] splitTheVlue = fullName.split(" ");
		System.out.println("split");
		System.out.println(splitTheVlue[0]);
		System.out.println(splitTheVlue[1]);
		System.out.println(splitTheVlue[2]);
		System.out.println("-----------------------------------------------");

    }


}

		

		
