package lang.string;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str1 = "Apple,Banana,Orange";

        // split()
        String[] splitstr = str1.split(","); // ',' 를 기준으로 문자열을 나누어 배열에 담겠다라는 뜻

        for (String s : splitstr) {
            System.out.println(s);
        }

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열: " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitstr);
        System.out.println(result);
    }
}
