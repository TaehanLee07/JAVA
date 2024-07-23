package review.extend;

public class HamBurger {
    String name;

    public HamBurger() {
        this.name = "햄버거";
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?\n" +
                "> 양상추\n+ 패티\n+ 피클");
    }
}
