package construct;

public class Book {
    String title;
    String author;
    int page;

    public Book() {
        this.title = "";
        this.author = "";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.page = 0;
    }
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    void displayInfo() {
        System.out.println("제목 : " + this.title + " 저자 : " + " 페이지 : " + this.page);
    }
}
