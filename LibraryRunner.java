package com.xworkz.encapsulation;

public class LibraryRunner {
    public static void main(String[] args) {
        Library book = new Library(1024,"half girlfriend","Chetan Bhagath","Sparoww books",2014,"cool","Hindi","love story",
        		280,200,500,"S154",19,16,20,false,true,22,20,"Bangalore");
        
        
        
        
        System.out.println("Book Id: " + book.getbook_id());
        System.out.println("Author: " + book.getauthor());
        System.out.println("Publisher: " + book.getpublisher());

    }
}
