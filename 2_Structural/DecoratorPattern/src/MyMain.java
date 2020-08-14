import Component.Car;
import Component.BasicCar;
import Decorator.LuxuryCar;
import Decorator.SportsCar;

public class MyMain {
	
	 public static void main(String[] args) {
		 
	        Car sportsCar = new SportsCar(new BasicCar());
	        sportsCar.decorateCar();
	        System.out.println("\n*****");
	         
	        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
	        sportsLuxuryCar.decorateCar();
	    }
	 
	 

}
