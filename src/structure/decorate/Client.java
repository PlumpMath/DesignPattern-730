/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.decorate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author dengxt
 */
public class Client {
    public static void main(String[] args) throws FileNotFoundException, UnknownHostException, IOException{
        //Decoreator Design Patterns
        Reader reader1 = new FileReader("test.txt");
        
        Reader reader2 = new BufferedReader(new FileReader("test.txt"));
        
        Reader reader3 = new LineNumberReader(new BufferedReader(new FileReader("test.txt")));
        
        //Read from socket.
        Socket socket = new Socket("localhost", 8080);
        Reader reader4 = new LineNumberReader(new InputStreamReader(socket.getInputStream()));
        //socket.getInputStream -> adptor pattern.
    }
}
