package Chain;

public interface ChainInterface {

	public abstract void setNext(ChainInterface nextInHandler);

	public abstract void process(String fileType);

}

