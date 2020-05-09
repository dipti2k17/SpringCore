package com.spring.model;

public class Book {
	private String bookName;
	private int quantity;
	
	public Book() { };
	
	public Book(String bookName, int quantity) {
		this.bookName = bookName;
		this.quantity = quantity;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", quantity=" + quantity + "]";
	}
	
	

}
