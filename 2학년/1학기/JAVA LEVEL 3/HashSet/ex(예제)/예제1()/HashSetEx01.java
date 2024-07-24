package hash;

import java.util.HashSet;
import java.util.Scanner;

public class hashSetEx01 {
    public static void main(String[] args) {
        solution(3,7);
    }
  
    static boolean solution(int arr, int target) {
        Scanner sc = new Scanner(System.in);
        int targets = sc.nextInt();
        int arrs[] = new int[arr];
        int na = 0;

        for (int i = 0; i < arr; i++) {
            arrs[i] = sc.nextInt();
            na = targets - arrs[i];
            if (na + arrs[i] == targets)
                return true;
            na = 0;
        }
            return false;
}
