package Elements;

import Visitor.IInterviewVisitor;

public class AptitudeRound implements IInterview {

	@Override
	public void getMaxMarks() {
		System.out.println("-----Looking into all records of all Students for MaxMarks in AptitudeRound -----");
		System.out.println("Max Marks : " + 100);
	}

	@Override
	public void getMinMarks() {
		System.out.println("-----Looking into all records of all Students for MinMarks in AptitudeRound-----");
		System.out.println("Min Marks : " + 50);

	}

	@Override
	public boolean accept(IInterviewVisitor visitor) {
		visitor.visit(this);
		return true;
	}

}

