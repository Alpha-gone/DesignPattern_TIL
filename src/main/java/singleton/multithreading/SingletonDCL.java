package singleton.multithreading;


public class SingletonDCL {
    private volatile static SingletonDCL uniqueInstance;

    private SingletonDCL(){}

    public static synchronized SingletonDCL getUniqueInstance() {
        if(uniqueInstance == null) {
            synchronized (SingletonDCL.class){
                if (uniqueInstance == null) uniqueInstance = new SingletonDCL();
            }
        }

        return uniqueInstance;
    }

}
