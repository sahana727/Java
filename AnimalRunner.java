package com.xworkz.typecasting;

public class AnimalRunner {
	
	

	public static void main(String[] args) {
		
		Animals animal = new Dog();
		animal.makingSound();
		
		Device device = new Television();
		device.charging();
		
		System.out.println("down casting");
		
		Dog dog = (Dog) animal;
		dog.barking();
	}

}
