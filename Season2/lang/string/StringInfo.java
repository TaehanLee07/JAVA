package lang.string;

public class StringInfo {
    // 문자열 정보 조회
    public static void main(String[] args) {
        String str = "hello java";

        System.out.println("문자열의 길이 = " + str.length());
        System.out.println("문자열이 비어 있는지 : " + str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인지1 : " + str.isBlank());
        System.out.println("문자열이 비어 있거나 공백인지2 : " + " ".isBlank()); // 자바 11버전 이상

        char c = str.charAt(7);
        System.out.println("8번째 인덱스 (인덱스는 0부터 시작하기 때문)의 문자 (공백 포함)" + c);
    }
}
