import package02.Image;
import package02.ProxyImage;


public class MyMain {
	
	public static void main(String[] args) {
		
		
		Image img1 = new ProxyImage("sample/proxyImage1.png");
		Image img2 = new ProxyImage("sample/proxyImage2.png");
		Image img3 = new ProxyImage("sample/proxyImage3.png");
			
		img1.showImage(); // This will call RealImage
		
		
	}

}
