/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command;

/**
 *
 * @author dengxt
 */
public class NullP {

    private static final NullP INSTANCE = new NullP();

    private NullP() {
    }

    public static NullP getInstance() {
        return INSTANCE;
    }
}
