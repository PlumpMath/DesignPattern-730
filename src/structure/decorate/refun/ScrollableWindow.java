/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.decorate.refun;

/**
 *
 * @author dengxt
 */
public class ScrollableWindow extends DecoratedWindow{

	/**
	 * Additional State 
	 */
	private Object scrollBarObjectRepresentation = null;
	
	public ScrollableWindow(Window windowRefernce) {

		super(windowRefernce);
	}
	
	@Override
	public void renderWindow() {
	
		// render scroll bar 
		renderScrollBarObject();
		
		// render decorated window
		super.renderWindow();
	}

        /**
         * Add additional function to window.
         */
	private void renderScrollBarObject() {

		// prepare scroll bar 
		scrollBarObjectRepresentation = new  Object();
		
		
		// render scrollbar 
		
	}	
}
