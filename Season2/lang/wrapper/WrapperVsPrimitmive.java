package lang.wrapper;

public class WrapperVsPrimitmive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis(); // 시스템 상 시간
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis(); // 반복 후 시간

        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) + "ms");

        // 래퍼 클래스 long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 박싱
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간 : " + (endTime - startTime) + "ms");
    }
}
/*
기본형 연산이 래퍼 클래스보다 대략 10여배 빠른 것을 확인할 수 있다. (시스템 마다 다름)
기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지한다.
래퍼 클래스의 인스턴스는 내부에 필드로 가지고 있는 기본형의 값 뿐만 아니라 자바에서 객체 자ㅔ를 다루는데 필요한
객체 메타데이터를 포함하므로 더 많은 메모리를 사용하게 된다. (대략 8 ~ 16 바이트)

위 연산은 10억번의 연산을 수행하는데 대략 때 0.2 와 3.1초의 차이만큼 발생한다.
기본형이든 래퍼 클래스든 이것을 1회로 환산하면 둘 다 매우 빠르게 연산이 수행된다.
일반적으로 애플리케이션을 만드는 관점에서 보면 사막의 모래알 하나 정도의 차이가 날뿐이다.
Cpu 연산을 아주 많이 수행하는 특수한 경우이거나 수만 ~ 수천만번 이상 연속해서 해야하는 경우라면 기본형을
사용해서 최적화를 고려해야 한다.
그렇지 않은 일반적인 경우라면 코드를 유지보수하기 더 나은것을 선택하면 된다.

유지보수 vs 최적화
유집보수와 최적화 중 우선 고려할 사항은 유지보수하기 좋은 코드이다.
특히 최신 컴퓨터는 매우 빠르기 때문에 메모리 상에서 발생하는 연산을 몇 번 줄인다고해도 실질적인 도움이 되지 않는 경우가 많다.

*/
