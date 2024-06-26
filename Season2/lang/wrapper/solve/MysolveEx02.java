package wrapperC;

import java.util.*;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Integer[] a = new Integer[n];
            Integer[] b = new Integer[m];

            for (int x = 0; x < n; x++) a[x] = sc.nextInt();
            for (int x = 0; x < m; x++) b[x] = sc.nextInt();
            Arrays.sort(b);



            int result = 0;


            for (int x = 0; x < n; x++) {
                int first = 0;
                int end = m - 1;
                int index = 0;
                int mid = (end + first) / 2;
                while (first <= end) {
                    mid = (end + first) / 2;
                    if (a[x] > b[mid]) {
                        first = mid+1;
                        index = mid+1;
                    }
                    else {
                        end = mid -1;
                    }
                }
                result += index;
            }
            System.out.println(result);
        }
    }


}
