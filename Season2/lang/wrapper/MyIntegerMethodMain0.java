package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);

        System.out.println("i1 : " + i1);
        System.out.println("i2 : " + i2);
        System.out.println("i3 : " + i3);
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else
            return 0;
    }
    /*
        value와 비교 대상 값을 compareTo() 라는 외부 메서드를 사용해서 비교한다.
        그런데 자기 자신의 value와 다른 값을 연산하는 것이기 때문에 항상 자기 자신의 갑인 value가 사용된다.
        만약 value가 객체라면 value객체 스스로 자신의 값과 다른 값을 비교한느 메서드를 만드는 것이 더 유용하다.
    */
}
