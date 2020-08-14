package Client;

import models.Address;
import models.Employee;

/**
 * Java provides a simple interface named Cloneable,That provides an
 * implementation of the Prototype pattern.
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Karnataka", "Bangalore");
		Employee employee1 = new Employee("Abhishek", address);
		
		
		Employee employee2 = employee1; 
		System.out.println(employee1 == employee2);      //Both reference-variable points to same object in HEAP.
		System.out.println(employee1.equals(employee2)); //Both Employee Object has same contents

//
//		Employee clonedEmployee = employee.clone();
//
//		System.out.println(employee == clonedEmployee);
//		System.out.println(employee.equals(clonedEmployee));
//		
////		
////		System.out.println(employee.getName() == clonedEmployee.getName());
////		System.out.println(employee.getAddress() == clonedEmployee.getAddress());
////		System.out.println(employee.getAddress().getState() == clonedEmployee.getAddress().getState());
////		System.out.println(employee.getAddress().getCity() == clonedEmployee.getAddress().getCity());
////		
////		System.out.println(employee == clonedEmployee);

	}

}
