package poly.ex.pay1;

public abstract class PayStore {
    // 결제 수단 추가 및 삭제같은 변경시
    // 수정하는 추상 클래스
    public static Pay findPay(String option) {
        if (option.equals("kakao"))
            return new KakaoPay();
        else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
