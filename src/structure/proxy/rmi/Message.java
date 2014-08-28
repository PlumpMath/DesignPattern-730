/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.rmi;

import java.io.Serializable;

/**
 *
 * @author dengxt
 */
public class Message implements Serializable, Comparable<Message>{
    
    private String from;
    
    private String to;
    
    private String content;
    
    private boolean toAll = false;
    
    private long time = System.currentTimeMillis();
    
    public static Message newMessage(){
        
        return new Message();
    };
    
    public Message from(String f){
        this.from = f;
        return this;
    }
    
    public Message to(String t){
        
        if(t == null|| t.isEmpty()){
            toAll = true;
            return this;
        }
        
        this.to = t;
        return this;
    }
    
    public Message content(String c){
        this.content = c;
        return this;
    }
    
    @Override
    public String toString(){
        
        StringBuilder builder = new StringBuilder();
        builder.append(from).append((to==null)? " said:":" @said:").append(content).append("\n");
        return builder.toString();
    }

    @Override
    public int compareTo(Message o) {
        return this.time == o.time ? (this.from.compareTo(o.from)):(Integer.valueOf(""+(this.time - o.time)));
    }
    
    public boolean all(){
        return toAll;
    }
    
    public String to(){
        return this.to;
    }
    
    public String from(){
        return this.from; 
    }
}
