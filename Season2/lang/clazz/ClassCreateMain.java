package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        // 동적 할당
        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        // getDeclaredConstructor() : 생성자를 선택
        // newInstance() : 선택된 생성자를 기반으로 인스턴스를 생성한다.
        String res = hello.hello();
        System.out.println("result = " + res);
    }
}
/*
리플랙션 : reflection
Class를 사용하면 클래스의 메타 정보를 기반으로 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해
객체 인스ㅓㄴ스를 새엇ㅇ하거나 메서드를 호출하는 작업을 할 수 있다.
이런 작업을 리플랙션이라고 한다.
*/
