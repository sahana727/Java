public class ArrayExamples
{
	public static void main(String[] args)
	{
	  int[] intArray={90,80,60,70,80,70,100,120,80,60};
	  byte[] byteArray={1,3,5,7,9,11,13,15,17,19};
	  short[] shortArray={70,65,75,77,87,85,80,82,90,78};
	  long[] longArray={100,200,300,60,37,65,43,54,32,10};
	  char[] charArray={'A','B','C','D','E','F','G','H','I','J'};
	  String[] stringArray={"sahana","Raj","Prathi","Sanni","sanvi","anu","nireeksha","pooja","mani","sathvi"};
	  float[] floatArray={12.1f,4.7f,43.5f,23.5f,10.5f,20.5f,3.6f,7.6f,80.4f,33.6f};
	  double[] doubleArray={100.2d,20.5d,4.6d,29.8d,45.9d,56.7d,67.8d,98.6d,12.65d,65.34d};
	 
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
	  System.out.println("Middle to right:");
	  for(int i=5;i<intArray.length;i++)
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
	  
	  System.out.println("left to right:");
	  for(int i=0;i<byteArray.length;i++)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("right to left:");
	  for(int i=byteArray.length-1;i>=0;i--)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<byteArray.length;i++)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=6;i>=0;i--)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<byteArray.length;i=i+2)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  
	  System.out.println("left to right:");
	  for(int i=0;i<shortArray.length;i++)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("right to left:");
	  for(int i=shortArray.length-1;i>=0;i--)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<shortArray.length;i++)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<shortArray.length;i=i+2)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  
	  System.out.println("left to right:");
	  for(int i=0;i<longArray.length;i++)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("right to left:");
	  for(int i=longArray.length-1;i>=0;i--)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<longArray.length;i++)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<longArray.length;i=i+2)
	  {
	  	System.out.println(longArray[i]);
	  }
	 
	  System.out.println("left to right:");
	  for(int i=0;i<charArray.length;i++)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("right to left:");
	  for(int i=intArray.length-1;i>=0;i--)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<charArray.length;i++)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<charArray.length;i=i+2)
	  {
	  	System.out.println(charArray[i]);
	  }
	  
	  System.out.println("left to right:");
	  for(int i=0;i<stringArray.length;i++)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("right to left:");
	  for(int i=stringArray.length-1;i>=0;i--)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<stringArray.length;i++)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<stringArray.length;i=i+2)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  
	  System.out.println("left to right:");
	  for(int i=0;i<floatArray.length;i++)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("right to left:");
	  for(int i=floatArray.length-1;i>=0;i--)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.print("Middle to right:");
	  for(int i=5;i<floatArray.length;i++)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<floatArray.length;i=i+2)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  
	  System.out.println("left to right:");
	  for(int i=0;i<doubleArray.length;i++)
	  {
	  	System.out.println(doubleArray[i]);
	  }
	  System.out.println("right to left:");
	  for(int i=doubleArray.length-1;i>=0;i--)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.print("Middle to right:");
	  for(int i=5;i<floatArray.length;i++)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<floatArray.length;i=i+2)
	  {
	  	System.out.println(floatArray[i]);
	  }

	}
}