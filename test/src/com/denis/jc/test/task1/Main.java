package com.denis.jc.test.task1;

import com.denis.jc.test.task1.Book.Author;

public class Main {

	public static void main(String[] args) {
		Author author = new Book().new Author();
		author.displayBookInfo();

	}

}
