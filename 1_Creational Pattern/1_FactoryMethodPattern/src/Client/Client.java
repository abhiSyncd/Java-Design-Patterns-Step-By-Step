package Client;

import Factory.PizzaFactorySubclass;
import Factory.PizzaFactory;
import Product.Pizza;

public class Client {

	public static void main(String[] args) {

		PizzaFactory p = new PizzaFactorySubclass();
		p.createPizza("Cheese");

	}
}
