package State;

import Context.Context;

public class StateOne implements IState {

	@Override
	public void execute(Context context) {

		System.out.println("State One Entered!!");
		// Perform Some Action on object reached State 1

		// Set Object to State 2
		context.setState(new StateTwo());
	}
}
