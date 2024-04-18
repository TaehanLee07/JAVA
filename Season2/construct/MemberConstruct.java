package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    // 셍성자
    // 접근제어자 안쓰면 생성자는 클래스따라간다
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
