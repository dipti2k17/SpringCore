package com.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TypesCollection {
	private List<String> bookList;
	private Set<String> bookSet;
	private Map<Integer, String> bookMap;
	private Properties bookProp;
	private List<Book> bookLists;
	public List<String> getBookList() {
		return bookList;
	}
	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}
	public Set<String> getBookSet() {
		return bookSet;
	}
	public void setBookSet(Set<String> bookSet) {
		this.bookSet = bookSet;
	}
	public Map<Integer, String> getBookMap() {
		return bookMap;
	}
	public void setBookMap(Map<Integer, String> bookMap) {
		this.bookMap = bookMap;
	}
	public Properties getBookProp() {
		return bookProp;
	}
	public void setBookProp(Properties bookProp) {
		this.bookProp = bookProp;
	}
	public List<Book> getBookLists() {
		return bookLists;
	}
	public void setBookLists(List<Book> bookLists) {
		this.bookLists = bookLists;
	}
	@Override
	public String toString() {
		return "TypesCollection [bookList=" + bookList + ", bookSet=" + bookSet
				+ ", bookMap=" + bookMap + ", bookProp=" + bookProp
				+ ", bookLists=" + bookLists + "]";
	}


}
