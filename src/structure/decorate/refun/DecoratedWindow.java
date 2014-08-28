/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.decorate.refun;

/**
 *
 * @author dengxt
 */
public class DecoratedWindow implements Window{

        /**
	 * private reference to the window being decorated 
	 */
	private Window privateWindowRefernce = null;
	
	public DecoratedWindow( Window windowRefernce) {
	
		this.privateWindowRefernce = windowRefernce;
	}

	@Override
	public void renderWindow() {

		privateWindowRefernce.renderWindow();
		
	}

}
