package enumeration.test.ex01;

public class AuthorMain {
    public static void main(String[] args) {
        printInfo(AuthorGrade.GUEST);
        printInfo(AuthorGrade.LOGIN);
        printInfo(AuthorGrade.ADMIN);
    }
    private static void printInfo(AuthorGrade Agrade) {
        System.out.println(Agrade.name() + ", " + Agrade.getLevel() + ", " + Agrade.getDesc());
    }
}
