package State;

import Context.Context;

public class StateThree implements IState {

	@Override
	public void execute(Context context) {

		System.out.println("State Three Executed!!");
	}

}
