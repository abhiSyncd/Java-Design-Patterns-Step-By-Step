package Mediator;

/*
 * Problem :
Chatroom(Mediator) : Defines an interface for communicating with Colleague objects.

ChatroomImpl (ConcreteMediator) : implements the operations defined by the Chatroom interface, such as Add,remove people in Chatroom

Participant(Collegue) 
-keep a reference to its Mediator object
-Communicates with the Mediator whenever it needs to communicate with other Colleague

Example : Chat Application 

Participants
Mediator 
Defines an interface for communicating with Colleague objects.

Concrete Mediator 
-Knows the colleague classes and keep a reference to the colleague objects.
-Implements the communication and transfer the messages between the colleague classes


Colleague classes - 
keep a reference to its Mediator object
Communicates with the Mediator whenever it needs to communicate with other Colleague
 * 
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import Colleague.Persons;

public class WhatsAppGroup implements ChatApplication {

	List<Persons> persons = new ArrayList();

	@Override
	public void addPerson(Persons person) {
		persons.add(person);
	}

	@Override
	public void DistributeMessage(Persons cg, String msg) {
		for (Persons person : this.persons) {
			person.receiveMessage(msg);
		}
	}

}


