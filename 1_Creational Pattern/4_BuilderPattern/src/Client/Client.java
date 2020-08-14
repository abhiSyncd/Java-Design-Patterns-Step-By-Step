package Client;

import Model.Phone;

public class Client {
	public static void main(String[] args) {
		
		Phone.Builder builder = new Phone.Builder()
				 .company("Apple")
				 .price(10000)
				 .singleCamera("yes")
				 .dualCamera("yes")
				 .fingerPrintRecognition("no");
		
		Phone phone = builder.build();	
		
		System.out.println(phone.toString());
	}

}
