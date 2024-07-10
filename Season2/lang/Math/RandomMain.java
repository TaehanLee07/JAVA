package lang.Math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

//      Random random = new Random();
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);
        
        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble); // 0.0d ~ 1.0d 미만
        
        boolean randomBool = random.nextBoolean();
        System.out.println("randomBool = " + randomBool);
        
        int randomRange = random.nextInt(10); // 0 ~ 9
        System.out.println("randomRange = " + randomRange);

        int randomRange2 = random.nextInt(10) +1; // 1 ~ 10
        System.out.println("randomRange2 = " + randomRange);
    }
}
/*
* 씨드 : Seed
* Random은 내부에서 seed값을 이용한다 이 seed값이 값으면 항상 같은 값을 출력한다.
* new Random() : 생성자를 비워두면 내부에서 System.nanoTime() 에 여려가지 복잡한 알고리즘을 섞어서 씨드값을 생성한다.
* 따라서 반복 실행해도 결과가 항상 달라진다.
* new Random(int seed): 생성자에 seed값을 직접 전달할 수 있다. 씨드 값이 같으면 여러번 반복 실행해도 실생결과 같다.
* 이렇게 씨드 값을 직접 사용하면 결과 값이 항상 같기 때문에 결과가 달라지는 랜덤값을 구할 수 없다.
* 하지만 결과가 고정되기 때문에 테스트 코드 같은 곳에서 같은 결과를 검증할 수 잇따.
* 참고로 마인크래프트는 시작할 때 지형을 랜덤으로 생성하는데 같은 씨드값을 설정하면 같은 지형을 생성할 수 있다.
* */
