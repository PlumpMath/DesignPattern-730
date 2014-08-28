/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command;

/**
 *
 * @author dengxt
 */
public class NullR {

    private static final NullR INSTANCE = new NullR();

    private NullR() {
    }

    public static NullR getInstance() {
        return INSTANCE;
    }
}
