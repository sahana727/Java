package com.xworkz.typecasting;

public class DownCasting {
	
	public static void main(String[] args) {
		
		float freezingpoint = 5.3f;
		int freezingpoint2 = (int) freezingpoint;
		
		long bankbalence = 15000;
		int bankbalence2 =(int) bankbalence;
		
		int population = 26000;
		short population1 =(short) population;
		
		short marks = 95;
		byte marks1 =(byte) marks;
		
		System.out.println("Freezing point :"+freezingpoint2);
		System.out.println("bank balence :"+bankbalence2);
		System.out.println("Population :"+population1);
		System.out.println("Marks in a sub :"+marks1);
		
	}

}
