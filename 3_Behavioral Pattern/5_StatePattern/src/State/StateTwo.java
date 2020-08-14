package State;

import Context.Context;

public class StateTwo implements IState {

	@Override
	public void execute(Context context) {

		System.out.println("State Two Entered!!");
		// Perform Some Action on object reached State 1

		// Set Object to State 3
		context.setState(new StateThree());

	}

}
