package Factory;

import Product.CheesePizza;
import Product.ChickenPizza;
import Product.PaneerPizza;
import Product.Pizza;

public class MakeVegPizzaSubFactory extends PizzaFactory{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		
		switch(type)
		{
		case "Cheese" : pizza = new CheesePizza();
			            break;
				          
		case "Paneer" : pizza = new PaneerPizza();
                        break;          
			          
		 default      : throw new RuntimeException("No Such Pizza");
		}
				
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
}
	
}
