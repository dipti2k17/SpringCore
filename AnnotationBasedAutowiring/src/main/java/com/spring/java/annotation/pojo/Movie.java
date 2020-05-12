package com.spring.java.annotation.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.java.annotation.customqualifier.MovieQualifier;

public class Movie {
	
	@Autowired
	private MovieCatalog movieCatalog;
	
	@Autowired
    @MovieQualifier(format = Format.VHS, genre="Action")
    private MovieCatalog actionVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Comedy")
    private MovieCatalog comedyVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.DVD, genre="Action")
    private MovieCatalog actionDvdCatalog;

    @Autowired
    @MovieQualifier(format=Format.BLURAY, genre="Comedy")
    private MovieCatalog comedyBluRayCatalog;

    public Movie() { };
    
	public Movie(MovieCatalog actionVhsCatalog, MovieCatalog comedyVhsCatalog,
			MovieCatalog actionDvdCatalog, MovieCatalog comedyBluRayCatalog) {
		super();
		this.actionVhsCatalog = actionVhsCatalog;
		this.comedyVhsCatalog = comedyVhsCatalog;
		this.actionDvdCatalog = actionDvdCatalog;
		this.comedyBluRayCatalog = comedyBluRayCatalog;
	}




	public MovieCatalog getActionVhsCatalog() {
		return actionVhsCatalog;
	}

	public void setActionVhsCatalog(MovieCatalog actionVhsCatalog) {
		this.actionVhsCatalog = actionVhsCatalog;
	}

	public MovieCatalog getComedyVhsCatalog() {
		return comedyVhsCatalog;
	}

	public void setComedyVhsCatalog(MovieCatalog comedyVhsCatalog) {
		this.comedyVhsCatalog = comedyVhsCatalog;
	}

	public MovieCatalog getActionDvdCatalog() {
		return actionDvdCatalog;
	}

	public void setActionDvdCatalog(MovieCatalog actionDvdCatalog) {
		this.actionDvdCatalog = actionDvdCatalog;
	}

	public MovieCatalog getComedyBluRayCatalog() {
		return comedyBluRayCatalog;
	}

	public void setComedyBluRayCatalog(MovieCatalog comedyBluRayCatalog) {
		this.comedyBluRayCatalog = comedyBluRayCatalog;
	}

	@Override
	public String toString() {
		return "Movie [actionVhsCatalog=" + actionVhsCatalog
				+ ", comedyVhsCatalog=" + comedyVhsCatalog
				+ ", actionDvdCatalog=" + actionDvdCatalog
				+ ", comedyBluRayCatalog=" + comedyBluRayCatalog + "]";
	}
    
}
