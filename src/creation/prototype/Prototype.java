/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 *
 * @author dengxt
 */
public class Prototype<T extends Prototype> implements Cloneable, Serializable {

    public T deep() throws IOException, OptionalDataException, ClassNotFoundException {
        
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (T) (oi.readObject());
    }

    public T thin() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}