package com.spring.beans.methodinjection;

public class Car {
	
    public String move()
    {
        System.out.println("Car is moving");
        return "moving";
    }
    public String stop()
    {
        System.out.println("Car has stopped");
        return "stopped state";
    }
}
