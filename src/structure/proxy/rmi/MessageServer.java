/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.rmi;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author dengxt
 */
public class MessageServer {

    public static void main(final String[] args) {
        
        try {
            MessageServiceImpl service = new MessageServiceImpl();
            Context context = new InitialContext();
            context.bind("rmi://127.0.0.1:1099/MessageService", service);
            System.out.println("server started...");
        } catch (NamingException ex) {
            Logger.getLogger(MessageServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(MessageServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
