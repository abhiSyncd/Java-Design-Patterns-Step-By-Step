import State.StateOne;
import State.StateTwo;
import Context.Context;


public class MyMain {
	
	public static void main(String[] args) {
		
		Context context = new Context(new StateOne());	
	    context.runLifeCycle();
		context.runLifeCycle();
		context.runLifeCycle();
		
		
	
		
	}

}
