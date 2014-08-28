/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.virtual;

/**
 * The image proxy is a virtual proxy that creates and loads the actual image object on demand. 
 * thus saving the cost of loading an image into memory until it needs to be rendered:
 * @author dengxt
 */
public class ImageProxy implements Image{
        /**
	 * Private Proxy data 
	 */
	private String imageFilePath;
	
	/**
	 * Reference to RealSubject
	 */
	private Image proxifiedImage;
	
	
	public ImageProxy(String imageFilePath) {
		this.imageFilePath= imageFilePath;	
	}
	
	@Override
	public void showImage() {
		// create the Image Object only when the image is required to be shown
		proxifiedImage = new HighResolutionImage(imageFilePath);
		
		// now call showImage on realSubject
		proxifiedImage.showImage();	
	}

}
