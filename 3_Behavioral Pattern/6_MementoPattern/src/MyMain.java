import Caretaker.PlayerCaretaker;
import Memento.PlayerMemento;
import Originator.PlayerOriginator;

/**
 * Originator : Object for which the state is to be saved
 * 
 * Memento : Originator-Object is saved in and restored from memento;
 * 
 * Caretaker : Keeps track of multiple memento using DQueue colleection
 *
 */
public class MyMain {

	public static void main(String[] args) {

		// ---------------- Saving State1 ----------------
		PlayerOriginator po = new PlayerOriginator();
		po.setHealth(10);

		PlayerMemento pm = new PlayerMemento(5);

		PlayerCaretaker pc = new PlayerCaretaker();
		pc.addMemento(pm);

		//System.out.println(po.getHealth());

		// ---------------- Saving State2 ----------------
		po.setHealth(10);
		pm = po.saveToMemento();
		pc.addMemento(pm);
		//System.out.println(po.getHealth());
		
		

		// ---------------- Restoring previous State ----------------
		PlayerMemento restoredpm = pc.getMemento();
		po.restoreFromMemento(restoredpm);
		System.out.println(po.getHealth());

	}

}
