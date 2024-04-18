package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 기본생성자 생략됨 개발자가 생성자를 만들지않은 경우 자바가 직업 기본생성자를 만들어준다
    //    public MemberInit() {}

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


}


