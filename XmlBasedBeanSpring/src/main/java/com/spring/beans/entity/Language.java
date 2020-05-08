package com.spring.beans.entity;

public class Language {
	
	private String language;
	
	public Language() {
		System.out.println("inside Language ()..........");
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Language [language=" + language + "]";
	}

	

}
