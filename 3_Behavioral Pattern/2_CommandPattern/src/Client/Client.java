package Client;

import java.util.ArrayList;
import java.util.List;

import Commands.Command;
import Commands.TurnAcOff;
import Commands.TurnAcOn;
import Commands.TurnAllOff;
import Commands.TurnTvOn;
import Invoker.RemoteControl;
import Receiver.AirConditioner;
import Receiver.ElectronicDevice;
import Receiver.Television;

public class Client {

	public static void main(String[] args) {

		RemoteControl remote = new RemoteControl();

		Television tv = new Television();
		AirConditioner ac = new AirConditioner();

		// Creating Commands : tvOn | tvOff | acOn | acOff
		Command tvOn = new TurnTvOn(tv);
		Command tvOff = new TurnTvOn(tv);
		Command acOn = new TurnAcOn(ac);
		Command acOff = new TurnAcOff(ac);

		// Creating Command : allOff
		List<ElectronicDevice> deviceList = new ArrayList();
		deviceList.add(tv);
		deviceList.add(ac);
		Command allOff = new TurnAllOff(deviceList);

		// Invoking Command : you can pass either : tvOn | tvOff | acOn | acOff | allOff  
		remote.setCommand(tvOn);
		remote.pressButton();

	}
}


