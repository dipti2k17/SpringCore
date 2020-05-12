package com.spring.java.annotation.generics.pojo;

public class StringStore<T> {

	T obj;

	public StringStore(T obj) {
		this.obj = obj;
	}

	public StringStore() {
		getObject();
	}

	public T getObject() {
		return this.obj;
	}
}
