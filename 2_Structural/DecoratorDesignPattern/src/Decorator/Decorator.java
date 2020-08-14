package Decorator;

import Product.Pizza;

public class Decorator extends Pizza{

	public Pizza pizza;
	

	public Decorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}



	@Override
	public void addIngredients() {
		
		pizza.addIngredients();
	}

}
