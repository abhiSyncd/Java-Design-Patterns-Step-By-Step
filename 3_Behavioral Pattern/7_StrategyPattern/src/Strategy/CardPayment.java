package Strategy;

public class CardPayment implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment is done by Debit/Credit Card");
	}

}


