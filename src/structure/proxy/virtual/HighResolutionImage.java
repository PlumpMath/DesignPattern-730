/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.virtual;

/**
 * RealSubject Implementation, which is the concrete and heavyweight implementation of the image interface. 
 * The High resolution image, loads a high resolution image from disk, and renders it to screen when showImage() is called.
 * @author dengxt
 */
public class HighResolutionImage implements Image {

	public HighResolutionImage(String imageFilePath) {
		
		loadImage(imageFilePath);
	}

	private void loadImage(String imageFilePath) {

		// load Image from disk into memory
		// this is heavy and costly operation
	}

	@Override
	public void showImage() {

		// Actual Image rendering logic
	}

}
