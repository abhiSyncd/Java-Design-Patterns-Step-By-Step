package Subscriber;

import Publisher.Blog1;
import Publisher.IPublisher;

public interface ISubscriber {
	public void update(String post);

}
