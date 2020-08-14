package Client;

import Chain.ChainInterface;
import Chain.DefaultProcessor;
import Chain.JSONProcessor;
import Chain.XMLProcessor;

public class Client {

	public static void main(String[] args) {
		ChainInterface xmlProcessor = new XMLProcessor();
		ChainInterface jsonProcessor = new JSONProcessor();
		ChainInterface defaultProcessor = new DefaultProcessor();

		xmlProcessor.setNext(jsonProcessor);
		jsonProcessor.setNext(defaultProcessor);

		// Input By Client
		xmlProcessor.process("xml");
	}

}

