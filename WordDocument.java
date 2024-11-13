package com.xworkz.abstraction;

public class WordDocument extends Documents{
	
	@Override
	public void openDocument() {
		System.out.println(" Word file Open ");
	}
	
	@Override
	public void closeDocument() {
		System.out.println("Word file close ");
	}
	
	@Override
	public void editDocument() {
		System.out.println("Word file Edit");
	}

}
