package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        Class clazz = String.class; // 클래스에서 조회

        // 모든 필드 조회(출력)
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("Filed : " + field.getType() + " " + field.getName());
        }

        // 모든 메서드 조회
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Methods : " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        // Object 클래스 출력 됨

        // 인터페이스 정보를 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface : " + i.getName());
        }
    }
}
/*
Class 클래스의 주요 기능
1. 타입 정보 얻기 : 클래스의 이름, 슈퍼 클래스, 인터페이스, 접근 제한자 등과 같은 정보를 조회할 수 있다.
2. 리플랙션 클래스의 정의된 메서드, 필드, 생성자등을 조회할 수 있고 이들을 통해 객체 인스턴스를 생성하거나
    메서드를 호출하는 등의 작업을 할 수 있다.
3. 동적 로딩과 생성: Class.forName() 메서드를 사용하여 클래스를 동적으로 로ㄷ하고, newInstance() 메서드를 통해
    새로운 인스턴스를 생성할 수 있다.
    참고(동적 로딩) - 런타임때 클래스를 로드하는 프로세스를 말함
4. 에노테이션 처리: 클래스에 적용된 에노테이션을 조회하고 처리하는 기능을 제공한다.

Class의 주요 기능
1. getDeclaredFields(): 클래스의 모든 필드를 조회한다.
2. getDeclaredMethods() : 클래스의 모든 메서드를 조회한다.
3. getSuperClass() : 클래스의 부모 클래스를 조회한다.
4. getInterfaces() : 클래스의 인터페이스를 조회한다.
*/
