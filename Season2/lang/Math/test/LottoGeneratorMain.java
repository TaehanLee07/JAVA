package lang.Math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNums = generator.generate();

        for (int lottoNumber : lottoNums) {
            System.out.println(lottoNumber + " ");
        }
    }
}
// 1~ 45 중 6개값 중복없이 뽑아야 함
