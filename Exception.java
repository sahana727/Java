package com.xworkz.exception;
import java.io.ClassNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class Exception {

	public static void main(String[] args) {
		
		try {
			FileInputStream inputStream = new FileInputStream("hdf");
			Class.forName("java.lang.Stri");
			
		}
		
		catch(IOException e){
			System.out.println("wwwwwww");
			
			e.printStackTrace();
			
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
	}
}
