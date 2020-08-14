package Decorator;

import Product.Pizza;

public class Exotica extends Decorator {

	public Exotica(Pizza pizza) {
		super(pizza);
		pizza.addIngredients();
		 System.out.print("Olives+Jalapenos added");
	}

}
