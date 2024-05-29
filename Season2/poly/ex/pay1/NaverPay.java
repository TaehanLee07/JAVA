package poly.ex.pay1;

public class NaverPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("네이버 페이와 연동합니다. " + amount + "원 만큼 결제를 시도합니다.");
        return true;
    }
}
