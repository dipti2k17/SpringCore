package com.spring.java.annotation.generics.pojo;

public class IntegerStore<T> {
	
	T obj;

	IntegerStore(T obj) {
		this.obj = obj;
	}

	public IntegerStore() {
		// TODO Auto-generated constructor stub
	}

	public T getObject() {
		return this.obj;
	}

}
