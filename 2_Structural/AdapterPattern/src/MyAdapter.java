import Interface1.Duck;
import Interface2.Turkey;


public class MyAdapter implements Duck{
	
	
	//Implementing Composition 
	Turkey turkey;	
	public MyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	
	@Override
	public void say() {		
		turkey.say();
	}

}
