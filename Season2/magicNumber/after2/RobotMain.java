package magicNumber.after2;

public class RobotMain {

    public static void main(String[] args) {
       Robot robot = new Robot("Smith");
       robot.order(Robot.Command.WALK);
       robot.order(Robot.Command.STOP);
       robot.order(Robot.Command.JUMP);


       // robot.order(100);
    }
}
