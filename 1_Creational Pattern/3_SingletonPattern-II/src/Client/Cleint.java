package Client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;



/**
*
	Breaking Singleton : 
	>Reflection
	>Serialization
	>Cloning
	>Multi Threading
	>Multiple Class Loader
	>Garbadge Collection
*	
*/

public class Cleint {

	public static void main(String[] args) {
     
		
		Singleton.getInstance().doSomething();
		
	/**
	 *  Code For Checking REFLECTION-SAFE Singleton
	 *  
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (Singleton) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1.hashCode():- " + instance1.hashCode());   
		System.out.println("instance2.hashCode():- " + instance2.hashCode());   
    **/
		
		
		
	/**	
	 * Code For Checking SERIALIZATION-SAFE Singleton
	 * 
		try{
			 Singleton instance1 = Singleton.getInstance(); 
	         ObjectOutput out  = new ObjectOutputStream(new FileOutputStream("file.text")); 
	         out.writeObject(instance1); 
	         out.close(); 
	   
	         // deserailize from file to object 
	         ObjectInput in  = new ObjectInputStream(new FileInputStream("file.text")); 
	           
	         Singleton instance2 = (Singleton) in.readObject(); 
	         in.close(); 
	   
	         System.out.println("instance1 hashCode:- " + instance1.hashCode()); 
	         System.out.println("instance2 hashCode:- " + instance2.hashCode());
		 }  catch (Exception e)  { 
            e.printStackTrace(); 
        } 
	**/


		
		
	/**
	  *  Code For Checking CLONABLE-SAFE Singleton 
	  *   
	    Singleton instance1 = Singleton.getInstance(); 
		Singleton instance2;
		try {
		   instance2 = (Singleton) instance1.clone();
		   System.out.println("instance1 hashCode:- " + instance1.hashCode()); 
           System.out.println("instance2 hashCode:- " + instance2.hashCode());  
		 }catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
	  *
      */   
		    
		    
		    
		
	}
}
