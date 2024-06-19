package lang.string;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str1 = " Java Programming ";

        System.out.println("소문자로 변환: " + str1.toLowerCase());
        System.out.println("대문자로 변환: " + str1.toUpperCase());
        System.out.println("공백 제거 (trim): " + str1.trim());
        System.out.println("공백 제거 (strip): " + str1.strip());
        System.out.println("앞 공백 제거: " + str1.stripLeading()); // 앞 공백 제거
        System.out.println("뒷 공백 제거: " + str1.stripTrailing()); // 뒷 공백 제거
        System.out.println("공백 제거 (replaceAll): " + str1.replaceAll(" ", ""));

    }
}
