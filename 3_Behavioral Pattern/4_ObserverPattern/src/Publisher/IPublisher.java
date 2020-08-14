package Publisher;

import Subscriber.ISubscriber;

public interface IPublisher {

	public void registerSubscriber(ISubscriber subscriber);

    public void removeSubscriber(ISubscriber subscriber);

    public void notifyAllSubscribers();
    
    
    
}
