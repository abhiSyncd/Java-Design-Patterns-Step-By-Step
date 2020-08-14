package Client;

import Context.PaymentContext;
import Strategy.CardPayment;
import Strategy.IPayment;

/**
 * Strategy : Is an interface common to all supported algorithm-specific
 * classes.
 * 
 * Context : Provides the interface to client for payment. The Context maintains
 * a reference to a Strategy object and is instantiated and initialized by
 * clients with a ConcreteStrategy object.
 *
 */
public class Client {

	public static void main(String[] args) {

		// ------------- Using Strategy Pattern -------------
		PaymentContext ct = new PaymentContext(new CardPayment());
		ct.executeStrategy();

		// ------------- Using Template Pattern --------------
		// IPayment creditPayment = new CardPayment();
		// creditPayment.pay();

	}

}


