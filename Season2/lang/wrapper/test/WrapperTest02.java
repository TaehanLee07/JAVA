package lang.wrapper;

public class WrapperTest02 {
    public static void main(String[] args) {
        String[] arr = {"1.5", "2.5", "3.0"};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Double.parseDouble(arr[i]);
        }
        System.out.println(sum);

    }
}
