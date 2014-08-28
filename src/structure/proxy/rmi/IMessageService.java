/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author dengxt
 */
public interface IMessageService extends Remote{
    
    int regist(String userName, String password)throws RemoteException;
    
    int login(String userName, String password)throws RemoteException;
    
    void logout(String user)throws RemoteException;
    
    void toMessge(Message msg)throws RemoteException;
    
    Message fromMessage(String user)throws RemoteException;
}
