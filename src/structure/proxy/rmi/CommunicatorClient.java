/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.rmi;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
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
public class CommunicatorClient {

    private static String me = "";
    private static IMessageService service = null;
    private static Console console = System.console();
    private static PrintWriter writer = console.writer();

    private CommunicatorClient() {
    }

    public static IMessageService getClient() {
        writer.println("Get client...");
        Context context;
        try {
            context = new InitialContext();
            service = (IMessageService) context.lookup("rmi://localhost:1099/MessageService");
        } catch (NamingException ex) {
            Logger.getLogger(CommunicatorClient.class.getName()).log(Level.SEVERE, null, ex);
        }


//            service = (IMessageService) Naming.lookup("rmi://127.0.0.1:1099/MessageService");
        writer.println("Client is ready.");

        return service;
    }

    public static int login() throws RemoteException {

        if (service == null) {
            return 1;
        }

//        Console console = System.console();

        if (console == null) {
            writer.println("Couldn't get Console instance, maybe you're running this from within an IDE?");
            return 1;
        }

        String userName = console.readLine("User Name: ");
        char passwordArray[] = console.readPassword("Password: ");
        me = userName;
        return service.login(userName, new String(passwordArray));
    }

    public static int regist() throws RemoteException {

        if (service == null) {
            return 1;
        }

        if (console == null) {
            writer.println("Couldn't get Console instance, maybe you're running this from within an IDE?");
            return 1;
        }

        String userName = console.readLine("User Name: ");
        char passwordArray[] = console.readPassword("Password: ");
        me = userName;
        return service.regist(userName, new String(passwordArray));
    }

    public static void main(String[] args) throws IOException {
        
        service = getClient();
        int status = 0;
        String answer = console.readLine("Welcome to communicator room.\n Already have account? Y/N: ");
        if (answer != null && answer.startsWith("N")) {
            System.out.println("Regist your account to communicate with groups.");
            while ((status = regist()) != 0) {
                if (status == 1) {
                    System.out.println("System initialized error. System exist");
                    System.exit(0);
                }

                System.out.println("Please retry again.");
            }
            System.out.println("Thank you for your join. Have a fun.");
        } else {
            while ((status = login()) != 0) {
                if (status == 1) {
                    System.out.println("System initialized error. System exist");
                    System.exit(0);
                }

                System.out.println("Please retry again.");
            }
            System.out.println("Thank you for your join. Have a fun.");
        }


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Message msg = service.fromMessage(me);
                        System.out.print(msg);
                    }

                } catch (RemoteException ex) {
                    Logger.getLogger(CommunicatorClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t.start();
        
        String line;
        String to;
        String content;
        Message msg;

        while (!"^Z".equalsIgnoreCase(line = console.readLine(me+":"))) {

            if (line.length() > 1 && line.charAt(0) == '>') {
                int start = line.indexOf(":");
                if (start > 0 && start < line.length() - 1) {
                    to = line.substring(1, start).trim();
                    content = line.substring(start + 1, line.length());
                    msg = Message.newMessage().from(me).to(to).content(content);
                } else {
                    msg = Message.newMessage().from(me).to(null).content(line);
                }
            } else {
                msg = Message.newMessage().from(me).to(null).content(line);
            }

            service.toMessge(msg);
        }

        service.logout(me);
    }
}
