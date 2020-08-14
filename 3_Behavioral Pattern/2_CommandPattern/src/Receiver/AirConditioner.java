package Receiver;

public class AirConditioner implements ElectronicDevice {

	@Override
	public void on() {
		System.out.println("AC is ON");
	}

	@Override
	public void off() {
		System.out.println("AC is OFF");
	}

}


