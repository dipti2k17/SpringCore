package com.spring.beans.methodinjection;


public class Command {
	
	private Car car;
	
	public Command() { };

	public Command(Car car){
        this.car=car;
    }

	public void setState(String commandState) {
		car.stop();
		
	}

	public String execute() {
		// TODO Auto-generated method stub
		return car.move();
	}

}
