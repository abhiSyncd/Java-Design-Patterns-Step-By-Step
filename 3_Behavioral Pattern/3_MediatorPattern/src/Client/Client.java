package Client;
import Colleague.Persons;
import Colleague.Person2;
import Colleague.Person1;
import Mediator.WhatsAppGroup;
import Mediator.ChatApplication;

public class Client {

	public static void main(String[] args) {

		// list of participants
		Persons person1 = new Person1("Abhishek");
		Persons person2 = new Person2("Rohit");

		//ChatApplication is a Mediator between all Persons(Colleagues)
		ChatApplication mediator = new WhatsAppGroup();
		mediator.addPerson(person1);
		mediator.addPerson(person2);

		person1.sendMessage(mediator, "Hi Everyone in the Group");

	}

}

/**
   Objects no longer communicate directly with each other, but instead communicate through the MEDIATOR
   Here person 1 communicating with other person in the group using 'Mediator'
   
*/

