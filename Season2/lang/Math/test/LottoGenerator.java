package lang.Math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random r = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;
        while (count < 6) {
            int number = r.nextInt(45) + 1;
            // 중복 제거
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }
    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number)
                return false;
            else
                return true;
        }
        return true;
    }
}
