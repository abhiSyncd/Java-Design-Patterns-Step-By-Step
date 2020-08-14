package Chain;

public class DefaultProcessor implements ChainInterface {

	private ChainInterface nextInChain;

	@Override
	public void setNext(ChainInterface chain) {
		nextInChain = chain;
	}

	@Override
	public void process(String fileType) {

		System.out.println("No Handler of input File Type is found");

	}

}
