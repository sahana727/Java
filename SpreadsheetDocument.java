package com.xworkz.abstraction;

public class SpreadsheetDocument extends Documents{
	
	@Override
	public void openDocument() {
		System.out.println("Open the spreadsheet document");
	}
	
	@Override
	public void closeDocument() {
		System.out.println("close the spreadsheet document");
	}
	
	@Override
	public void editDocument() {
		System.out.println("Edit the spreadsheet document");
	}

}
