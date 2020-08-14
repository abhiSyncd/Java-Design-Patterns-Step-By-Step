package Caretaker;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import Memento.PlayerMemento;
import Originator.PlayerOriginator;

/**
 * Caretaker : Object that keeps track of multiple memento. Like maintaining
 * savepoints.
 *
 */
public class PlayerCaretaker {

	final Deque<PlayerMemento> mementos = new ArrayDeque<>();

	public void addMemento(PlayerMemento memento) {
		mementos.add(memento);
	}

	public PlayerMemento getMemento() {

		PlayerMemento empMemento = mementos.pop();
		return empMemento;
	}

}
