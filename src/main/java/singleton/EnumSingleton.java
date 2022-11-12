package singleton;

public enum EnumSingleton {
    INSTANCE;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
