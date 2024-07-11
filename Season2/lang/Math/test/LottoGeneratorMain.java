package lang.Math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNums = generator.generate();
        Arrays.sort(lottoNums); // 정렬
        for (int lottoNumber : lottoNums) {
            System.out.print(lottoNumber + " ");
        }
    }
}
// 1~ 45 중 6개값 중복없이 뽑아야 함
