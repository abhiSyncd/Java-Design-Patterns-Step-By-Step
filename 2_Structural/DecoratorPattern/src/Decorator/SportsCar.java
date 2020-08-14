package Decorator;

import Component.Car;

public class SportsCar extends CarDecorator {
	
	 public SportsCar(Car c) {
	        super(c);
	    }
	 
	    @Override
	    public void decorateCar(){
	        car.decorateCar();
	        System.out.print(" Adding features of Sports Car.");
	    }

}
