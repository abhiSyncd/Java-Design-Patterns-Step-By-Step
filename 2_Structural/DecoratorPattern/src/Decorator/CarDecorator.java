package Decorator;

import Component.Car;

public class CarDecorator implements Car {
	
	protected Car car;
     
	public CarDecorator(Car c){
	        this.car=c;
	}
	     
	@Override
	 public void decorateCar() {
	        car.decorateCar();
	 }		
}
