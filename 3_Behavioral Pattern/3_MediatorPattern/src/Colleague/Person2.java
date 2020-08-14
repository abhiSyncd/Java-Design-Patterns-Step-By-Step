package Colleague;

import Mediator.ChatApplication;

public class Person2 implements Persons {

	private String userName;

	public Person2(String userName) {
		this.userName = userName;
	}

	@Override
	public void sendMessage(ChatApplication chat, String msg) {
		chat.DistributeMessage(this, msg);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println("Message Received By 2nd person : " + msg);
	}

}
