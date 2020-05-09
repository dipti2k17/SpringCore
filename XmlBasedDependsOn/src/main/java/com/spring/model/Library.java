package com.spring.model;


public class Library {
	private Book book;

	public Library() { } ;
	
	
	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [book=" + book + "]";
	}
	
	

}
