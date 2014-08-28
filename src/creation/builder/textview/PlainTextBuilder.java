/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.builder.textview;

/**
 *
 * @author dengxt
 */
public class PlainTextBuilder implements Builder{
    
    StringBuffer buffer  = null;
    
    public PlainTextBuilder(){
        buffer = new StringBuffer();
    }
    
    @Override
    public void makeTitle(String text) {
        //TODO
    }

    @Override
    public void makeBody(String text) {
       //TODO
    }

    @Override
    public void makeSignature(String text) {
        //TODO
    }

    @Override
    public String text() {
        return null;
    }
}
