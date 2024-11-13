package com.xworkz.abstraction;

public abstract class Documents {
	
	public abstract void openDocument();
	
	public abstract void closeDocument();
	
	public abstract void editDocument();
	
	public void printDocument() {
		
		System.out.println("Print the document");
	}

}
