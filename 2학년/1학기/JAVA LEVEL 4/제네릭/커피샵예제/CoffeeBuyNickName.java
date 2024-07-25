package generics.coffee;

public class CoffeeBuyNickName {
    public String nickName;

    public CoffeeBuyNickName(String nickName) {
        this.nickName = nickName;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + nickName);
    }
}
