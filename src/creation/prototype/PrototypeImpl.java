/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.prototype;

import java.io.IOException;
import java.io.OptionalDataException;
import java.util.HashMap;

public class PrototypeImpl extends Prototype<PrototypeImpl> {
    
    private final String KEY = "KEY_FOR_TEST";
    private int x;
    
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    public PrototypeImpl(int x) {
        this.x = x;
    }
    
    public void setX(int x) {
        this.x = x;
        map.put(KEY, x);
    }
    
    public int getX() {
        return x;
    }
    
    public int getV(){
        return map.get(KEY);
    }
    
    public void printX() {
        System.out.println("Value: " + getX());
    }

    public static void main(String args[]) throws CloneNotSupportedException, IOException, OptionalDataException, ClassNotFoundException {

        PrototypeImpl prototype = new PrototypeImpl(1000);
        
        
        for (int y = 1; y < 10; y++) {
            
            PrototypeImpl thinCopy = prototype.thin();
            thinCopy.setX(thinCopy.getX() * y);
            assert prototype.x == y*1000;
            assert prototype != thinCopy;
            assert prototype.x == thinCopy.x;
            assert prototype.map == thinCopy.map;
            
            PrototypeImpl deepCopy = prototype.deep();
            deepCopy.setX(deepCopy.getX() * y);
            assert prototype.x == 1000;
            assert prototype.x != deepCopy.x;
            assert prototype.map != deepCopy.map;
            assert prototype.getV() != deepCopy.getV();
        }
    }
}
