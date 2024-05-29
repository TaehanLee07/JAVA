package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();
        for (int i = 0; i < 1;) {

            System.out.println("결제 수단을 입력하세요");
            String payOption = sc.next();
            if (payOption.equals("exit")) {
                i++;
                System.out.println("프로그램이 종료됩니다");
            }else {
                System.out.println("결제 금액을 입력하세요");
                int amount = sc.nextInt();
                payService.processPay(payOption, amount);
            }
            }
        }
    }



/*
결제 수단을 입력하세요 : kakao
결제 금액을 입력하세요 : 5000
결제를 시작합니다. option : kakao amount : 5000
카카오페이 시스템과 연결합니다.
5000원 결제를 시작합니다.
결제가 성공했습니다.
결제 수단을 하세요 : exit
프로그램을 종료합니다.
*/
