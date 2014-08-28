/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * MessageServiceImpl
 * The implementation is real subject. And the stub is proxy for the implementaion.
 * Remote Proxies: 
 * providing a local representation for an object that is in a different address space. 
 * A common example is Java RMI stub objects. The stub object acts as a proxy where invoking methods
 * on the stub would cause the stub to communicate and invoke methods on a remote object (called 
 * skeleton) found on a different machine.
 * @author dengxt
 */
public class MessageServiceImpl extends UnicastRemoteObject implements IMessageService {

    private HashMap<String, String> users = new HashMap<String, String>();
    private HashMap<String, PriorityBlockingQueue<Message>> messages = new HashMap<String, PriorityBlockingQueue<Message>>();

    public MessageServiceImpl() throws RemoteException {
        System.out.println("Message Service is startup...");
    }

    @Override
    public int regist(String userName, String password) throws RemoteException {

        if (userName == null || userName.isEmpty()) {
            return 2;
        }

        if (password == null || password.isEmpty()) {
            return 2;
        }

        String pwd = users.get(userName);

        if (pwd == null) {
            System.out.println("User "+ userName +" regist.");
            users.put(userName, password);
            PriorityBlockingQueue messageQueue = new PriorityBlockingQueue<String>();
            messages.put(userName, messageQueue);
            return 0;
        }
        
        return 1;
    }

    @Override
    public int login(String userName, String password) throws RemoteException {

        String pwd = users.get(userName);

        if (pwd == null) {
            return 12;
        }
        
        System.out.println("User "+ userName +" login.");
        return pwd.equals(password) ? 0 : 13;
    }

    @Override
    public void logout(String user) throws RemoteException {
        System.out.println("User "+ user +" logout");
        users.remove(user);
    }

    @Override
    public void toMessge(Message msg) throws RemoteException {
        System.out.print(msg);
        if(msg.all()){
            for(Entry<String, PriorityBlockingQueue<Message>> e : messages.entrySet()){
                if(e.getKey().equals(msg.from())){
                    continue;
                }
                e.getValue().add(msg);
            }
        }else{
            Queue q = messages.get(msg.to());
            if(q == null){
               Message error = Message.newMessage().from("@Server").to(msg.from()).content("Message has not sent to "+msg.to()+".");
                q = messages.get(msg.from());
                if(q != null)q.add(error);
            }else{
                q.add(msg);
            }
        }
        
    }

    @Override
    public Message fromMessage(String user) throws RemoteException {
        try {
            Message message = messages.get(user).take();
            return message;
        } catch (InterruptedException ex) {
            Logger.getLogger(MessageServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
