package models;

public class Address implements Cloneable {

	private String state;
	private String city;

	public Address(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}

	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
	
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}