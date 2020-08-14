package Subscriber;

public class Subscriber1 implements ISubscriber {

	@Override
	public void update(String post) {
		System.out.println(" Sub 1 : You Got Notification ->"  + post);
	}
}
