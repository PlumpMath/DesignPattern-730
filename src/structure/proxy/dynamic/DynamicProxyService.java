/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 *
 * @author dengxt
 */
public class DynamicProxyService implements InvocationHandler, IDBService, IRemoteAccessService {

    public DynamicProxyService() {
    }

    public static Object newInstance(Class obj, Class[] interfaces) {

        return Proxy.newProxyInstance(obj.getClassLoader(), interfaces, new DynamicProxyService());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object retValue = null;
        try {
            String methodName = method.getName();
            if (methodName.equals("fetchContent")) {
                return fetchContent();
            } else if (methodName.equals("storeIntoDB")) {
                System.out.println(Arrays.toString(args));
                storeIntoDB((String) args[0]);
            }
        } catch (Exception e) {
            throw e;
        }

        return retValue;
    }

    @Override
    public String fetchContent() {
        return "Mock content";
    }

    @Override
    public void storeIntoDB(String content) {
        System.out.println("Content stored into DB. Content fetched from " + content);
    }
}
