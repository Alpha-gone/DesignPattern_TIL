package singleton;

public class ChocolateBoiler {
    private static ChocolateBoiler chocolateBoilerInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if(chocolateBoilerInstance == null) chocolateBoilerInstance = new ChocolateBoiler();

        return chocolateBoilerInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty() && !isBoiled()) empty = true;
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()) boiled = true;
    }
    private boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
