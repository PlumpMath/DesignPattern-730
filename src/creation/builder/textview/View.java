/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.builder.textview;

/**
 *
 * @author dengxt
 */
public class View {
    
    private Builder builder = null;
    
    public View(Builder builder){
        this.builder = builder;
    }

    public String getView(){
        builder.makeTitle("Say Hello");
        builder.makeBody("<Deng>: hello.");
        builder.makeSignature("Deng Xiaotao");
        return builder.text();
    }
    
    public static void main(String[] args){
        Builder builder = new HTMLBuilder();
        View v = new View(builder);
        System.out.println(v.getView());
    }
}
