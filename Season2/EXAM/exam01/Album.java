package extends2;

public class Album extends Item{
    String artist;

    public Album(String name, int price, String artist) {
        this.name = name;
        price = getPrice();
        this.artist = artist;
    }
    public void print() {
        System.out.println("이름 : " + this.name + " 가격 : " + getPrice() + "\n-아티스트 : " + this.artist);
    }
}
