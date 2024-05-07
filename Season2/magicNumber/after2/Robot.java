package magicNumber.after2;

public class Robot {
    private String name;

    public enum Command {
        WALK,
        STOP,
        JUMP,
    };

    public Robot(String name) {
        this.name = name;
    }

    public void order(Robot.Command command) {
        if (command == command.WALK)
            System.out.println(name + " walk");
        else if (command == command.STOP)
            System.out.println(name +" stop");
        else if (command == command.JUMP)
            System.out.println(name +" jump");
        else
            System.out.println("error");

    }
}
