package Client;

import Factory.PizzaFactory;
import Factory.MakeVegPizzaSubFactory;


public class Client {
	
	 public static void main(String[] args) {		 
		 		 
		 PizzaFactory p = new MakeVegPizzaSubFactory();
			          p.createPizza("Cheese");
			          p.createPizza("Paneer");	          
		 }

}
