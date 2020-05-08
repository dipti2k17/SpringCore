package com.spring.bean.test;

public class Name {
    private String value;
    private Name(String value) {
        this.value = value;
    }
    public static Name getInstance(String value) {
        return new Name(value);
    }
    public String getValue() {
        return value;
    }    
    public String toString() {
        return "Name Bean: " + value;
    }
}
