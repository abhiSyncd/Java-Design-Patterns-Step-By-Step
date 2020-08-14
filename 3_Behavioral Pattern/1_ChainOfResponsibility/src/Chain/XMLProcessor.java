package Chain;

public class XMLProcessor implements ChainInterface {

	private ChainInterface nextInChain;

	@Override
	public void setNext(ChainInterface chain) {
		nextInChain = chain;
	}

	@Override
	public void process(String fileType) {

		if (fileType.equals("xml"))
			System.out.println("Processing " + fileType + " File");
		else
			nextInChain.process(fileType);

	}
	
}


