package generics.coffee;

public class CoffeeBuyNumber {
    public int watingNumber;

    public CoffeeBuyNumber(int watingNumber) {
        this.watingNumber = watingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + watingNumber);
    }
}
