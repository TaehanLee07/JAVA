package extends2;

public class Movie extends Item{
    String director;
    String actor;

    public Movie(String name, int price, String director, String actor) {
        this.name = name;
        price = getPrice();
        this.director = director;
        this.actor = actor;
    }
    public void print() {
        System.out.println("이름 : " + this.name + " 가격 : " + getPrice() + "\n-감독 : " + this.director + " 배운 : " + this.actor);
    }
}
