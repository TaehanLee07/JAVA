package magicNumber.after;

public class Robot {
    private String name;

    // 상수화
    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {
        if (command == COMMAND_WALK)
            System.out.println(name + " walk");
        else if (command == COMMAND_STOP)
            System.out.println(name +" stop");
        else if (command == COMMAND_JUMP)
            System.out.println(name +" jump");
        else
            System.out.println("error");

    }
}
