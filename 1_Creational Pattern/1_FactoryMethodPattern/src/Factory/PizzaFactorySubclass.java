package Factory;

import Product.ChickenPizza;
import Product.Pizza;
import Product.CheesePizza;

public class PizzaFactorySubclass extends PizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza;
		
		switch (type) {
		case "Cheese":
			pizza = new CheesePizza();
			break;
		case "Chicken":
			pizza = new ChickenPizza();
			break;

		default:
			throw new IllegalArgumentException("No such pizza.");
		}

		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}

}
