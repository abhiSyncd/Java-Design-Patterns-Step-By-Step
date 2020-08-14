import Interface1.Duck;
import Interface1.MyDuck;
import Interface2.MyTurkey;
import Interface2.Turkey;



public class MyMain {
	
	 public static void main(String[] args) {
	
		//Duck duck = new MyDuck();	 
		Turkey turk = new MyTurkey();
		 
	 
		Duck mT = new MyAdapter(turk); // MyAdapter class is composed of "Turkey" class 
		mT.say();                      //Client sees that it is calling Duck's say() method
		
	 }

}
