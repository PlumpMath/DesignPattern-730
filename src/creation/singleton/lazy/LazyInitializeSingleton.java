package creation.singleton.lazy;

/**
 * A Lazy Way to initialize a Singleton Instance.
 *
 * @author dengxt
 *
 */
public class LazyInitializeSingleton {

    private static volatile LazyInitializeSingleton instance = null;

    private LazyInitializeSingleton() {
        //Some lightweight initialize task here.
    }

    public static LazyInitializeSingleton getInstance() {
        //Lazy initialize Singleton Pattern.
        if (instance == null) {

            synchronized (LazyInitializeSingleton.class) {

                if (instance == null) {
                    instance = new LazyInitializeSingleton();
                }
            }
        }

        return instance;
    }
}
