/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.adaptor.legacy.refactor;

import structure.adaptor.legacy.LegacyLine;

/**
 *
 * @author dengxt
 */
public class Line implements Shape {

    private LegacyLine adaptee = new LegacyLine();

    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
