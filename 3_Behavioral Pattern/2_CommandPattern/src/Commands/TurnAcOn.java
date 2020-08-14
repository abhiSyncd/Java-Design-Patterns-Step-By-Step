package Commands;

import Receiver.ElectronicDevice;

public class TurnAcOn implements Command {

	ElectronicDevice electronicDevice;

	public TurnAcOn(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		electronicDevice.on();
	}

}


