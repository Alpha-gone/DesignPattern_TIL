package command.reciver;

public class GarageDoor {
    private String location;

    public GarageDoor() {
    }

    public GarageDoor(String location) {
        this.location = location;
    }
    public void up(){
        System.out.println(location + " 차고문이 열렸습니다.");
    }

    public void down(){
        System.out.println(location + " 차고문이 닫혔습니다");
    }
    public void stop(){
        System.out.println(location + " 차고문이 멈췄습니다.");
    }
    public void lightOn(){
        System.out.println(location + " 차고 조명이 켜졌습니다.");
    }
    public void lightOff(){
        System.out.println(location + " 차고 조명이 꺼졌습니다.");
    }
}
