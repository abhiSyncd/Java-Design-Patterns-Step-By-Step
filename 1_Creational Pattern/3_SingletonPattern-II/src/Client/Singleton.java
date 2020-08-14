package Client;

import java.io.Serializable;

/**
 * Singleton pattern restricts the instantiation of a class and ensures that
 * only one instance of the class exists in the java virtual machine
 * 
 * Drawback : Not Thread Safe
 *
 */
public class Singleton  implements Serializable , Cloneable  {

	// Declare a private static instance , so that it can be accessed by only by getInstance() method 
	private volatile static Singleton singletonObj;

	
	// Make constructor private to restrict instantiation of the class from other classes using new operator.
	private Singleton() {
		 if( Singleton.singletonObj != null ) {
		        throw new InstantiationError( "Creating of this object is not allowed." ); // Reflection Safe
		    }
	}

	
	// Provide a public static method to create instance of Singleton class : Not Thread Safe
	public static Singleton getInstance() {
		if (singletonObj == null) {
			synchronized(Singleton.class) {  //Double Check : Thread Safe 
				if (singletonObj == null) {
				  singletonObj = new Singleton();
				}
			}	
		}
		return singletonObj;
	}
	
	
	// Implement readResolve method  : Serializable Safe
    private Object readResolve() { 
        return singletonObj; 
    } 
    
    
   // Override clone method  : Clonable  Safe
    @Override
    private Object clone() throws CloneNotSupportedException{ 
      throw new CloneNotSupportedException(); 
    } 
    
    
    

	// Method of Singleton Class which is to be called by other classes
	public void doSomething() {
		System.out.println("Method Executed in Singleton Class");
	}

}
