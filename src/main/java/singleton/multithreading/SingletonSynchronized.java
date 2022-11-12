package singleton.multithreading;


public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance;

    private SingletonSynchronized(){}

    public static synchronized SingletonSynchronized getUniqueInstance() {
        if(uniqueInstance == null) uniqueInstance = new SingletonSynchronized();

        return uniqueInstance;
    }

}
