package Elements;

import Visitor.IInterviewVisitor;

public class TechnicalRound implements  IInterview {

	@Override
	public void getMaxMarks() {
		System.out.println("-----Looking into all records of all Students for MaxMarks in TechnicalRound -----");
		System.out.println("Max Marks : " + 90);
	}

	@Override
	public void getMinMarks() {
		System.out.println("-----Looking into all records of all Students for MinMarks in TechnicalRound-----");
		System.out.println("Min Marks : " + 40);

	}

	@Override
	public boolean accept(IInterviewVisitor visitor) {
		visitor.visit(this);
		return true;
	}

}
