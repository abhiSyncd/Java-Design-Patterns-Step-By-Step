package Client;

import Publisher.Blog1;
import Subscriber.ISubscriber;
import Subscriber.Subscriber1;
import Subscriber.Subscriber2;

public class Client {

	public static void main(String args[]) {

		ISubscriber subscriber1 = new Subscriber1();
		ISubscriber subscriber2 = new Subscriber2();

		Blog1 blog = new Blog1();
		blog.registerSubscriber(subscriber1);
		blog.registerSubscriber(subscriber2);

		blog.setPost("New Post");

	}

}


