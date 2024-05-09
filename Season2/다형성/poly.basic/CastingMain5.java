package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        // 조건문으로 다운캐스팅 하기
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {  // A instanceof B A가 B를 참조하는지 맞으면 true 아니면 false 반환
            System.out.println("Child 인스턴스 맞음");
            ((Child)parent).childMethod();
        }
    }
    /*
     지금처럼 다운캐스팅을 수행하기 전에 먼저 instanceof 를 사용해서 원하는 타입으로 변경이 가능한지 확인한 다음에 다운캐스팅을
     수행 하는것이 안전하다.
     참고로 instanceof 키워드는 오른쪽 대상의 자식 타입을 왼쪽에 참조하는 경우에도 true를 반환한다.
     
     parent instanceof Parent : true
     
     new Parent() instanceof Parent : true
     new Child() instanceof Parent : true
    */
}
