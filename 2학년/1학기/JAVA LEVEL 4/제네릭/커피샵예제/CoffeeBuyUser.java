package generics.coffee;

import generics.user.User;

public class CoffeeBuyUser <T extends User> {
    public T user;

    public CoffeeBuyUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
