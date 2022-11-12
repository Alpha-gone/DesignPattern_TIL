package singleton.multithreading;


public class SingletonStaticInitializer {
    private static SingletonStaticInitializer uniqueInstance = new SingletonStaticInitializer();

    private SingletonStaticInitializer(){}

    public static SingletonStaticInitializer getUniqueInstance() {
        return uniqueInstance;
    }

}
