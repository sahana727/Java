public class Test{
	public static void main(String[] args){

    sum();
    area(2);

	}

	public static void sum(){
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Sum of two Number is : "+sum);
	}

	public static void area(int side)
	{
		 int areaOfSquare = side*side;
		System.out.println("Area of square is : "+areaOfSquare);
	}



}