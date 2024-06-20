import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int[] cntA = getAlphabetCnt(a);
        int[] cntB = getAlphabetCnt(b);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(cntA[i] - cntB[i]);
        }
        System.out.println(ans);
    }
    public static int[] getAlphabetCnt(String str) {
        int[] alphabetCnt = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            alphabetCnt[str.charAt(i)-'a']++;
        }
        return alphabetCnt;
    }
}
