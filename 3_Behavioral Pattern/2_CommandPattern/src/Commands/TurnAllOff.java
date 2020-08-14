package Commands;

import java.util.List;

import Receiver.ElectronicDevice;

public class TurnAllOff implements Command {

	List<ElectronicDevice> electronicDeviceList;

	public TurnAllOff(List<ElectronicDevice> electronicDeviceList) {
		this.electronicDeviceList = electronicDeviceList;
	}

	@Override
	public void execute() {
		for (ElectronicDevice device : electronicDeviceList) {
			device.off();
		}
	}

}




