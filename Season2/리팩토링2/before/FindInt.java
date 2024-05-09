package removeControlflag.before;

public class FindInt {
    public static boolean find(int data[], int number) { // 안좋은 코드
        boolean flag = false;

        for (int i = 0; i <data.length ; i++) {
            if (data[i] == number) {
                flag = true;
            }
        }
        return flag;
    }
}
