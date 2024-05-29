package poly.ex.pay1;

public class KakaoPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("카카오 페이 시스템과 연결합니다. " + amount + "원 결제를 시도합니다");
        return true;
    }
}
