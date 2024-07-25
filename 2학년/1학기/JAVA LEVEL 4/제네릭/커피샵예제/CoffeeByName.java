package generics.coffee;

public class CoffeeByName {
    public Object name; // Integer, Double, String...

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
