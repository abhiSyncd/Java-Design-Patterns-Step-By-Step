package Mediator;

import Colleague.Persons;

public interface ChatApplication {

	public void addPerson(Persons person);

	public void DistributeMessage(Persons person, String msg);

}
