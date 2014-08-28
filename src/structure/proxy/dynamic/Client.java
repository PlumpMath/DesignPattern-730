/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.dynamic;

/**
 *
 * @author dengxt
 */
public class Client {

    public static void main(String[] args) {
        
        IDBService dbService = (IDBService) DynamicProxyService.newInstance(RealDBService.class, new Class[]{IDBService.class});
        IRemoteAccessService remoteService = (RealHTTPService) DynamicProxyService.newInstance(RealHTTPService.class, new Class[]{ IRemoteAccessService.class});
        String content = remoteService.fetchContent();
        dbService.storeIntoDB(content);
    }
}
