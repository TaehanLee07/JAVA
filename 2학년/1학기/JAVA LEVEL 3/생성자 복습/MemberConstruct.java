package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    // 셍성자
    // 접근제어자 안쓰면 생성자는 클래스따라간다
    // 생성자를 하나라도만들면 더이상 자바가 자동으로 만들어주지않는다 따라서 기본생성자가 필요할때 만들어 줘야함
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
