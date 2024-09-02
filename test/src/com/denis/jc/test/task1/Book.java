package com.denis.jc.test.task1;

public class Book {
	String title = "Ученый в средневековье";
	
	class Author{
		String name = "Sandlord";
		int age = 45;
		
		void displayBookInfo() {
			System.out.println("Книга: " + title + ", Автор: " + name);
		}
	}

}
