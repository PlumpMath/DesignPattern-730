/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.dynamic;

/**
 *
 * @author dengxt
 */
public class RealHTTPService implements IRemoteAccessService {

    @Override
    public String fetchContent() {
        //TO build URL and return content.
        return "HTTP content";
    }
    
}
