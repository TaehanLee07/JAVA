package lang.wrapper;

public class MyInteegerNullMain {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(arr, -1)); // -1
        System.out.println(findValue(arr, 0)); // 0
        System.out.println(findValue(arr, 1)); // 1
        System.out.println(findValue(arr, 100)); // -1
    }
    private static int findValue(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}

/*
입력 값이 -1이면 -1을 반환한다.
그런데 배열에 없는 값이 1--을 입력해도 같은 -1이 반환된다.
입력값이 -1 일때는 생각해보면 배열에 -1값이 있어서 -1을 반환한것인지 아니면 -1 값이 없어서 -1을 반환한건지 명확하지 않다.
*/
