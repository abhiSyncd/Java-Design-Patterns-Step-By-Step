package Elements;

import Visitor.IInterviewVisitor;

public class ManagerialRound implements IInterview {

	@Override
	public void getMaxMarks() {
		System.out.println("-----Looking into all records of all Students for MaxMarks in ManagerialRound -----");
		System.out.println("Max Marks : " + 80);
	}

	@Override
	public void getMinMarks() {
		System.out.println("-----Looking into all records of all Students for MinMarks in ManagerialRound-----");
		System.out.println("Min Marks : " + 30);

	}

	@Override
	public boolean accept(IInterviewVisitor visitor) {
		visitor.visit(this);
		return true;
	}

}
