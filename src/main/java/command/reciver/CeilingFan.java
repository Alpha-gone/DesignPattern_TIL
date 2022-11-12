package command.reciver;

public class CeilingFan {
    private String location;
    private int level;
    private static final int HIGH = 2;
    private static final int MEDIUM = 1;
    private static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high(){
        level = HIGH;
        System.out.println(location + "거실 선풍기 속도가 HIGH로 설정되었습니다.");
    }

    public void medium(){
        level = MEDIUM;
        System.out.println(location + "거실 선풍기 속도가 MEDIUM로 설정되었습니다.");
    }

    public void low(){
        level = LOW;
        System.out.println(location + "거실 선풍기 속도가 LOW로 설정되었습니다.");
    }

    public void off(){
        level = 0;
        System.out.println(location + "거실 선풍기가 꺼졌습니다.");
    }

    public int getSpeed(){
        return level;
    }
}
