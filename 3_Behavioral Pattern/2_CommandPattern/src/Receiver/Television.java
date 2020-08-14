package Receiver;

public class Television implements ElectronicDevice {

	@Override
	public void on() {
		System.out.println("TV is ON");
	}

	@Override
	public void off() {
		System.out.println("TV is OFF");
	}

}
