package removeControlflag.after;

public class FindInt {
    public static boolean find(int data[], int number) { // 코드 리팩토링
        boolean found = false; // 의미가 불문명한 변수이름 x

        for (int i = 0; i <data.length ; i++) {
            if (data[i] == number) {
                found = true;
                return found;
            }
        }
        return found;
    }
}
