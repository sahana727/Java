package com.xworkz.typecasting;

public class UpCasting {
	
	public static void main(String[] args) {
	
	byte rainbowcolor = 7;
	short rainbowcolor1 = rainbowcolor;
	
	short alphabets = 26;
	int alphabets1 = alphabets;
	
	int bankbalence = 5000;
	long bankbalence1 = bankbalence;
	
	float boilingpoint = 100.3f;
	int boilingpoint1 = (int) boilingpoint;
	
	System.out.println("colors in rainbow :"+rainbowcolor1);
	System.out.println("Alphabets in english :"+alphabets1);
	System.out.println("Bank balence :"+bankbalence1);
	System.out.println("Boiling point of water :"+boilingpoint1);
	
	}

}
