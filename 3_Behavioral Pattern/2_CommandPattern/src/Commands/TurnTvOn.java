package Commands;

import Receiver.ElectronicDevice;

public class TurnTvOn implements Command {

	ElectronicDevice electronicDevice;

	public TurnTvOn(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		electronicDevice.on();
	}

}


