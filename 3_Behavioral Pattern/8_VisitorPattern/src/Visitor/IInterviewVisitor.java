package Visitor;

import Elements.AptitudeRound;
import Elements.ManagerialRound;
import Elements.TechnicalRound;

public interface IInterviewVisitor {
	void visit(AptitudeRound mailClient);

	void visit(TechnicalRound mailClient);

	void visit(ManagerialRound mailClient);
}
