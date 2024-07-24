package construct;

public class MemberInitMain02 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        // 메소드 이용한 초기화 1
        initMember(member1,"user1",15,90);
        MemberInit member2 = new MemberInit();
        // 메소드 이용한 초기화 2
        initMember(member2,"user2",16,80);

        MemberInit[]  members = {member1,member2};
        for (MemberInit s : members ) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }

    }
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
