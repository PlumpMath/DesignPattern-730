/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.virtual;

/**
 *The code below illustrates a sample image viewer program; the program simply loads three images, 
 * and renders only one image, once using the proxy pattern, and another time directly. Note that 
 * when using the proxy pattern, although three images have been loaded, the High resolution image is not 
 * loaded into memory until it needs to be rendered, while in the part not using the proxy, the three images 
 * are loaded into memory although one of them is actually rendered.
 * @author dengxt
 */
public class ImageViewer {
    
    	public static void main(String[] args) {
		
	// assuming that the user selects a folder that has 3 images create the 3 images 	
	Image highResolutionImage1 = new ImageProxy("sample/veryHighResPhoto1.jpeg");
	Image highResolutionImage2 = new ImageProxy("sample/veryHighResPhoto2.jpeg");
	Image highResolutionImage3 = new ImageProxy("sample/veryHighResPhoto3.jpeg");
	
	// assume that the user clicks on Image one item in a list
	// this would cause the program to call showImage() for that image only
	// note that in this case only image one was loaded into memory
	highResolutionImage1.showImage();
	
	// consider using the high resolution image object directly
	Image highResolutionImageNoProxy1 = new HighResolutionImage("sample/veryHighResPhoto1.jpeg");
	Image highResolutionImageNoProxy2 = new HighResolutionImage("sample/veryHighResPhoto2.jpeg");
	Image highResolutionImageBoProxy3 = new HighResolutionImage("sample/veryHighResPhoto3.jpeg");
	
	
	// assume that the user selects image two item from images list
	highResolutionImageNoProxy2.showImage();
	
	// note that in this case all images have been loaded into memory 
	// and not all have been actually displayed
	// this is a waste of memory resources
	
	}

}
