/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.composite.file;

/**
 *
 * @author dengxt
 */
public class Client {
    
    public static void main(String[] args){
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        bin.add(new File("test", 1234));
        bin.add(new File("latex", 3456));
        root.printList();
    }
}
