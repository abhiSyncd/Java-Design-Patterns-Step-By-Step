package Originator;

import Memento.PlayerMemento;

/**
 * Originator : Object for which the state is to be saved
 *
 */
public class PlayerOriginator {

	public int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public PlayerMemento saveToMemento() {
		return new PlayerMemento(this.health);
	}

	public void restoreFromMemento(PlayerMemento objMemento) {
		this.health = objMemento.health;

	}

}
