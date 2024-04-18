package hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hsahSetEx02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(set);
        System.out.println(set.toString());
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }   // 낱개로 가져오는법

        System.out.println();

        int[] newNums = set.stream().sorted().mapToInt(Integer::intValue).toArray(); // 위의 코드와 같은역할을함
        for(int n : newNums) {
            System.out.print(n + " ");
        }
    }
}
