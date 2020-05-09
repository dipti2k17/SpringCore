package com.spring.beans;

public class Book {
	
	private int bookId;
	private String bookName;
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}




	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	

}
