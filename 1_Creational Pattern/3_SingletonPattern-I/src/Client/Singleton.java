package Client;

public class Singleton {

	private static Singleton singletonObj;

	public Singleton() {
	}

	public static Singleton getInstance() {

		if (singletonObj == null) {
			singletonObj = new Singleton();
		}

		return singletonObj;
	}
	
	public void doSomething() {
		System.out.println("Method executed in Singleton Class");
	}

}