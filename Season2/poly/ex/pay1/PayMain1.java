package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao 결제
        String payOption = "kakao";
        int amount = 100000;
        payService.processPay(payOption, amount);

        // naver 결제
        String payOption2 = "naver";
        int amount2 = 100000;
        payService.processPay(payOption2,amount2);

        // 잘못된 결제
        String wrongOption = "apple";
        int amount3 = 100000;
        payService.processPay(wrongOption, amount3);
    }
}


