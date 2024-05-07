package magicNumber.before;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {
        if (command == 0) // 걷기
            System.out.println(name + " walk");
        else if (command == 1) // 멈추기
            System.out.println(name +" stop");
        else if (command == 2) // 점프
            System.out.println(name +" jump");
        else
            System.out.println("error");

    }
}
