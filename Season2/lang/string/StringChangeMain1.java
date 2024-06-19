package lang.string;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str1 = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 7부터의 나머지 문자열: " + str1.substring(7));
        System.out.println("인덱스 7부터 12까지의 부분 문자열: " + str1.substring(7, 12));
        System.out.println("문자열 결합 : " + str1.concat("!!!"));
        System.out.println("Java 를 World로 대체 : " + str1.replace("Java", "World"));
        System.out.println("첫번째 Java 를 World로 대체 : " + str1.replaceFirst("Java", "World"));
    }
}
