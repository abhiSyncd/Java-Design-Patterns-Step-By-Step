
import Decorator.Exotica;
import Factory.PizzaFactory;
import Factory.MakeVegPizzaSubFactory;
import Product.CheesePizza;
import Product.Pizza;


public class MyMain {
	
	 public static void main(String[] args) {		 
		 		 
		 Pizza ex = new Exotica(new CheesePizza());
		       ex.addIngredients(); 
		       	    		   
	          
		 }

}
