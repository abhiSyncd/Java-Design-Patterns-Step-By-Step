package Commands;

import Receiver.ElectronicDevice;

public class TurnAcOff implements Command {

	ElectronicDevice electronicDevice;

	public TurnAcOff(ElectronicDevice electronicDevice) {
		super();
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		electronicDevice.on();
	}

}



