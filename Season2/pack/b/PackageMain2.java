package pack;

import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User(); // 임포트는 한개만 가능 두개이상 임포트 불가 경로 써야함
        pack.b.User userB = new pack.b.User();
    }
}
