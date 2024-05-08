package extends2;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void print() {
        System.out.println("이름은 :" + name + "가격은 : " + price);
    }
}
