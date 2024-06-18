package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 memberA = new MemberV1("회원 A", address);
        MemberV1 memberB = new MemberV1("회원 B", address);

        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);

        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> MenberB.address");
        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);
    }
}
