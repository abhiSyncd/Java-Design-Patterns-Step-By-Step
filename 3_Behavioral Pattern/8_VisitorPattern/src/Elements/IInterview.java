package Elements;

import Visitor.IInterviewVisitor;

public interface IInterview {

	public void getMaxMarks();

	public void getMinMarks();

	boolean accept(IInterviewVisitor visitor);

}
