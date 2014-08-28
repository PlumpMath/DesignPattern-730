/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.file;

/**
 *
 * @author dengxt
 */
public class File extends Entry{
    
    private String name;
    private int size;
    
    public File(String name, int size){
        this.name = name;
        this.size = size;
    }
    
    @Override
    int getSize() {
        return size;
    }

    @Override
    String getName() {
        return name;
    }
    
    public void printList(String prefix){
        System.out.println(prefix + '/'+this);
    }
    
    @Override
    public String toString(){
        return name +" ("+ getSize()+")";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
