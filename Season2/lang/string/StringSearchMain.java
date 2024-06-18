package lang.string;

public class StringSearchMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java! Welcome to Java World";

        System.out.println("문자열에 'Java'가 포함되어 이는지: " + str1.contains("Java"));
        System.out.println("'Java'의 첫 번째 인덱스 : " + str1.indexOf("Java"));
        System.out.println("인덱스 10부터 'Java'의 인덱스 : " + str1.indexOf("Java", 10));
        System.out.println("'Java'의 마지막 인덱스 : " + str1.lastIndexOf("Java"));
    }
}
