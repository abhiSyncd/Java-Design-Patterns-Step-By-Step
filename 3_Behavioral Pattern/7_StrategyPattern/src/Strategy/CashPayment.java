package Strategy;

public class CashPayment implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment is done by Cash on Delievery");

	}
}
