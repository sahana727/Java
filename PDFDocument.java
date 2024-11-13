package com.xworkz.abstraction;

public class PDFDocument extends Documents{
	
	@Override
	public void openDocument() {
		System.out.println("Open the PDF document");
	}
	
	@Override
	public void closeDocument() {
		System.out.println("close the PDF document");
	}
	
	@Override
	public void editDocument() {
		System.out.println("Edit the PDF document");
	}
	

}
