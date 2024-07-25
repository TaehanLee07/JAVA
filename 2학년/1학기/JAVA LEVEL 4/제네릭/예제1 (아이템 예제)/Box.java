package generics.ex1;

public class Box <T, U>{
    public T item1;
    public U item2;

    public Box(T item1, U item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void getItem1() {
        System.out.println("Item1 : " + item1);
    }

    public void getItem2() {
        System.out.println("Item2 : " + item2);
    }

    public void display() {
        System.out.println("Item1 : " + item1 + " Item2 : " + item2);
    }
}
