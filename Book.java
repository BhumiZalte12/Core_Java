package com.itep.corejava;

import java.util.Scanner;

public class Book {

	int b_pages,price;
	String author,book_name;
	
	void set(String title,String author_name ,int book_pages,int b_price) {
		b_pages = book_pages;
		price = b_price;
		author = author_name;
		book_name = title;
	}
	void show() {
		System.out.println("book name is : "+book_name);
		System.out.println("book author is : "+author);
		System.out.println("book price is : "+price);
		System.out.println("book pages are is : "+b_pages);
		
	}
	public static void main(String[] args) {
		Book b = new Book();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book name : ");
		String book_name= sc.next();
		System.out.println("Enter the author name : ");
		String author= sc.next();
		System.out.println("Enter the book price : ");
		int book_price= sc.nextInt();
		System.out.println("Enter the book pages: ");
		int book_pages= sc.nextInt();
		b.set(book_name,author,book_pages,book_price);
		b.show();
	}
}
