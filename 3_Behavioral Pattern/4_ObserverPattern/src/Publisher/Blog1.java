package Publisher;

import java.util.ArrayList;
import java.util.List;

import Subscriber.ISubscriber;

public class Blog1 implements IPublisher {

	private String post;

	public void setPost(String post) {
		this.post = post;
		notifyAllSubscribers();
	}

	private List<ISubscriber> subscribers = new ArrayList();

	@Override
	public void registerSubscriber(ISubscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(ISubscriber subscriber) {
		subscribers.remove(subscriber);

	}

	@Override
	public void notifyAllSubscribers() {
		for (ISubscriber subscriber : subscribers) {
			System.out.println("Notifying Subscribers on publish post");
			subscriber.update(this.post);
		}
	}

}


