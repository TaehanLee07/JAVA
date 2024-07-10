package lang.Math.test;

import java.util.Random;

public class LottoGenerator {
    Random r = new Random();
    boolean isJungBook = true;
    public void generate() {
        int randomRange[] = new int[6];
        while(!isJungBook) {
            for (int i = 0; i < randomRange.length; i++) {
                randomRange[i] = r.nextInt(45)+1;
                if (randomRange[i] - randomRange[i+1] != 0)
                    isJungBook = false;


            }
        }
    }
}
