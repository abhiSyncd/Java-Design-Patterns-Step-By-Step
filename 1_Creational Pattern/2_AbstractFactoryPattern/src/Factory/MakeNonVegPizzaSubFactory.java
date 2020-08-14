package Factory;

import Product.CheesePizza;
import Product.ChickenPizza;
import Product.PaneerPizza;
import Product.Pizza;

public class MakeNonVegPizzaSubFactory extends PizzaFactory {

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza;

		switch (type) {
		case "Chicken":
			pizza = new ChickenPizza();
			break;

		default:
			throw new RuntimeException("No Such Pizza");
		}

		pizza.addIngredients();

		pizza.bakePizza();

		return pizza;
	}

}
