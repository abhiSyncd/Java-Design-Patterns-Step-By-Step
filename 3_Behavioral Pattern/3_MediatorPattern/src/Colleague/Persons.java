package Colleague;

import Mediator.ChatApplication;

public interface Persons {

	public void sendMessage(ChatApplication md, String msg);

	public void receiveMessage(String msg);

}
