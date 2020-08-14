package Client;

import Elements.AptitudeRound;
import Elements.ManagerialRound;
import Elements.TechnicalRound;
import Visitor.GetAverage;
import Visitor.IInterviewVisitor;

public class Client {
	public static void main(String[] args) {

		AptitudeRound aptRound = new AptitudeRound();
		TechnicalRound techRound = new TechnicalRound();
		ManagerialRound mgrRound = new ManagerialRound();

		IInterviewVisitor average = new GetAverage();

		// Either pass aptRound | techRound | mgrRound
		// if(aptRound.accept(average) != false;
		average.visit(aptRound);
	}

}



