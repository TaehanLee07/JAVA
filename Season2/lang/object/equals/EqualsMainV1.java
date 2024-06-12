package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id - 100");
        UserV1 user2 = new UserV1("id - 100");

        System.out.println("identity : " + (user1 == user2));
        System.out.println("equality : " + (user1.equals(user2)));

    }
}
/*
동일성 비교
user1 == user2
x001 == x002 : false

Object.equals() 메서드
public boolean equlas(Object obj) {
    return (this == obj);
    }
동등성 비교
user1.equals(user2)
return(user1 == user2)
return(x001 == x002)
false
즉 Object가 기본으로 제공하는 equals()는 == 으로 동일성 비교를 제공한다.
*/
