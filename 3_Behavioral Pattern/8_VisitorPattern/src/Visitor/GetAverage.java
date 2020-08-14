package Visitor;

import Elements.AptitudeRound;
import Elements.ManagerialRound;
import Elements.TechnicalRound;

public class GetAverage implements IInterviewVisitor {

	@Override
	public void visit(AptitudeRound aptRound) {
		System.out.println("-----Looking into all records of all Students for AvgMarks in AptitudeRound -----");
		System.out.println("Avg Marks is this");
	}

	@Override
	public void visit(TechnicalRound techRound) {
		System.out.println("-----Looking into all records of all Students for AvgMarks in TechnicalRound -----");
		System.out.println("Avg Marks is this");

	}

	@Override
	public void visit(ManagerialRound mgrRound) {
		System.out.println("-----Looking into all records of all Students for AvgMarks in ManagerialRound -----");
		System.out.println("Avg Marks is this");

	}

}

