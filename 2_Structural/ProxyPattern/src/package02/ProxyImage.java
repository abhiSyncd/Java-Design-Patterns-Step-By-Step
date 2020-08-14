package package02;

public class ProxyImage implements Image {

	private Image realImage;
	
	
	public ProxyImage(String proxyImagePath) {
		//Logic to get Image icon from cache
	}

	
	@Override
	public void showImage() {	
		realImage = new RealImage();
		realImage.showImage();	
	}

}


