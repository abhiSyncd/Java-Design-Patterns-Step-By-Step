package Decorator;

import Component.Car;

public class LuxuryCar extends CarDecorator{
	
	 public LuxuryCar(Car c) {
	        super(c);
	    }
	     
	    @Override
	    public void decorateCar(){
	        car.decorateCar();
	        System.out.print(" Adding features of Luxury Car.");
	    }

}
