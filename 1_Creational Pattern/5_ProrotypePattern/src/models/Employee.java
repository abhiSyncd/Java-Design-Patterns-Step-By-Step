package models;

public class Employee implements Cloneable {

	private String name;
	private Address address;


	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}