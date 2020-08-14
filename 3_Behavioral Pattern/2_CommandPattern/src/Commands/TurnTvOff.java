package Commands;

import Receiver.ElectronicDevice;

public class TurnTvOff implements Command {

	ElectronicDevice electronicDevice;

	public TurnTvOff(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		electronicDevice.on();
	}

}

