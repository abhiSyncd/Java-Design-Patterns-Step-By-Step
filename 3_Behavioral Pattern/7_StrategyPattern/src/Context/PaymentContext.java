package Context;

import Strategy.IPayment;

public class PaymentContext {

	IPayment payment;

	//this can be set at runtime by the application preferences
	public PaymentContext(IPayment payment) {
		super();
		this.payment = payment;
	}

	public void executeStrategy() {
		payment.pay();
	}

}
