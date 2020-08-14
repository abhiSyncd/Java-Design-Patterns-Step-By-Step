package Chain;

public class JSONProcessor implements ChainInterface {

	private ChainInterface nextInChain;

	@Override
	public void setNext(ChainInterface chain) {
		nextInChain = chain;
	}

	@Override
	public void process(String fileType) {

		if (fileType.equals("json"))
			System.out.println("Processing " + fileType + " File");
		else
			nextInChain.process(fileType);

	}

}

