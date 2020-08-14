package Subscriber;

public class Subscriber2 implements ISubscriber {

	@Override
	public void update(String post) {
		System.out.println(" Sub 2 : You Got Notification ->"  + post);
	}
}
