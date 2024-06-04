# 널 객체 사용시 문제점
- 객체의 null 여부를 확인하는 코드가 너무 많은 경우
- null 자체로도 위험성 있음.

- 자바에서 null을 다루는 것은 매우 중요한 주제이다.
- 여러가지 이유로 null을 사용하는 것은 좋지 않다.
## 1. 타입 안전성 저하와 NPE(NullPointerException)의 원인
    - 객체지향 언어에서는 각 객체가 특정한 타입을 가지며, 이를 컴파일을 통해서 타입 체크를 할 수 있다.
    - 하지만 null은 어떤 타입의 변수에서도 사용할 수 있기에 이는 타입 안정성을 저하시키고,
      NullPointerException의 원인이 된다.
## 2. 분기문과 SRP 위반
    - null이 존재할 경우 대부분 분기문의 사용으로 이어진다.
    - 분기문의 존재는 여러 책임의 존재를 암시하고, 단일 책임 원칙(SRP)을 위반하게 된다.
    - 이는 코드의 가독성과 유지보수성을 크게 저하시키게 된다.
null 을 다룰때는 조심해야 하며, null을 대체할 수 있는 방법을 고려해야 된다.
예를 들어 Optional 클래스를 활용하거나, null 대신 빈 값을 사용하는 방법도 있다.

# 리펙토링 단계
## 1. 널 객체 클래스를 작성한다.
    - 기존 null을 확인하는 클래스의 하위 클래스로 작성
    - isNull() 메서드 작성 : 기존 클래스는 false를 널 클래스는 true를 반환한다.
## 2. null 치환하기
    - null 코드 부분을 isNull() 메서드로 치환.
## 3. 널 객체 클래스를 재정의하여 조건 확인하ㄱ
    - isNull() 메서드를 사용하는 제어문을 찾아서 다음과 같이 수정
## 4. 예시 코드
    if (obj.isNull()) {
         // null에 해야 할 일
    } else {
        obj.doing();
    }
    널 클래스 doing() 메서드를 오버라이딩하여 null에 해당하는 코드 작성