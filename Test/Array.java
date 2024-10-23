public class Array{
	public static void main(String[] args){
		
		int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		System.out.println("left to right:");
	  for(int i=0;i<intArray.length;i++)
	  {
	  	System.out.println(intArray[i]);
	  }
	  System.out.println(" right to left:");
	  for(int i=intArray.length-1;i>=0;i--)
	  {
	  	System.out.println(intArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(intArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<intArray.length;i=i+2)
	  {
	  	System.out.println(intArray[i]);
	  }


	}
}