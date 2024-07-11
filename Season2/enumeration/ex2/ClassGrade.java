package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    private ClassGrade() {
    }
}



/*
앞서 본 String처럼 아무 문자열이나 다 사용할 수 있는 것이 아니고, 우리가 나열할 항목들만
BASIC, GOLD, DIAMOND만 사용하게 할 것이다.
-> 타입 안전 열거형 패턴
*/
