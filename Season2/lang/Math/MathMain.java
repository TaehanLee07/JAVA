package lang.Math;

public class MathMain {
    public static void main(String[] args) {
        System.out.println("Math.max(10, 20) = " + Math.max(10, 20));
        System.out.println("Math.min(10, 20) = " + Math.min(10, 20));
        System.out.println("Math.abs(-10) = " + Math.abs(-10));

        System.out.println("Math.ceil(2.1) = " + Math.ceil(2.1));
        System.out.println("Math.floor(2.7) = " + Math.floor(2.7));
        System.out.println("Math.round(2.5) = " + Math.round(2.5));

        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
        System.out.println("Math.random() = " + Math.random());
    }
}
/*
1. 기본 연산 메서드
  1) abs(x) : 절대값
  2) max(a, b) : a와 b중 최댓값
  3) min(a, b) : a와 b중 최솟값
2. 지수 및 로그 연산 메서드
  1) exp(x) : e^x 계산
  2) log(x) : 자연 로그
  3) log10(x) : 로그 10
  4) pow(a, b) : a의 b제곱
3. 반올림 및 정밀도 메서드
  1) ceil(x) : 올림
  2) floor(x) : 내임
  3) round(x) : 반올림
  4) rint(x) : 가장 가까운 정수로 반올림
4. 삼각 함수 메서드
  1) sin(x) : 사인
  2) cos(x) : 코사인
  3) tan(x) : 탄젠트
5. 기타 유용한 메서드
  1) sqrt(x) : 제곱근
  2) cbrt(x) : 세제곱근
  3) random(x) : 0.0과 1.0 사이의 무작위 값 생성
*/
