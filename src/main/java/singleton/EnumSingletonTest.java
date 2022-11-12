package singleton;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.setValue("test");

        System.out.println("singleton.getValue() = " + singleton.getValue());
    }
}
