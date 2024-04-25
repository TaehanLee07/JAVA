package pack;

import pack.a.User;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
//      pack.a.User user = new pack.a.User(); 패키지가 다르기에 임포트 혹은 경로 입력
        User user = new User();


    }
}
