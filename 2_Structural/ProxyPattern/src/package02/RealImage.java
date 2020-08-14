package package02;

public class RealImage implements Image {

	@Override
	public void showImage() {	
		
		try {		
			//Perform Netwok Call to get Enlarged Image from Database
			Thread.sleep(4000l);
			System.out.println("Image Loaded From Network");		
		   }catch (InterruptedException e) {
			e.printStackTrace();
		   }
		
	}

}
