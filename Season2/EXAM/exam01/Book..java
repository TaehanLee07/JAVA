package extends2;

public class Book extends Item{
    String author;
    String isbn;

    public Book(String name, int price,String author, String isbn) {
        this.name = name;
        price = getPrice();
        this.author = author;
        this.isbn = isbn;
    }
    public void print() {
        System.out.println("이름 : " + this.name + " 가격 : " + getPrice() + "\n-작가 : " + this.author + " isbn : " + this.isbn);
    }
}
