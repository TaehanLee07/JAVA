package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String res1 = a.concat(b);
        String res2 = a+b;

        System.out.println(res1);
        System.out.println(res2);
    }
}
