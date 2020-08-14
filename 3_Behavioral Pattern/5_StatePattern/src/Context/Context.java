package Context;

import State.IState;

public class Context {
	
	IState state;

	public Context(IState state) {
		super();
		this.state = state;
	}

	public void setState(IState state) {
		this.state = state;
	}

	
     public void runLifeCycle(){
		 state.execute(this);
	}

     
     

}
