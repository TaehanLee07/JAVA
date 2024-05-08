package extends2;

public class Item {
    String name;
    private int price;

    public int getPrice() {
        return this.price;
    }

    public void print(String name, int price) {
        System.out.println("이름 : " + this.name + " 가격 : " + this.price);
    }
}
