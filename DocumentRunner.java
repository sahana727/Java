package com.xworkz.abstraction;

public class DocumentRunner {
	public static void main(String[] args) {
		
		Documents pdf = new PDFDocument();
		System.out.println("For PDF Documents");
		pdf.openDocument();
		pdf.closeDocument();
		pdf.editDocument();
		pdf.printDocument();
		
		Documents word = new WordDocument();
		System.out.println("For Word Documents");
		word.openDocument();
		word.closeDocument();
		word.editDocument();
		word.printDocument();
		
		Documents spread = new SpreadsheetDocument();
		System.out.println("For SpreadSheet Documents");
		spread.openDocument();
		spread.closeDocument();
		spread.editDocument();
		spread.printDocument();
		
		
		
	}

}
