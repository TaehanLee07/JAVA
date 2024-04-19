package greedy;

import java.util.Scanner;

public class coin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int coin500 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin10 = 0;
		int totalCoin = 0;
		int N = sc.nextInt();
		
		while(N != 0) {
			if  (N >= 500) {
				N -= 500;
				coin500++;
			}else if (N >= 100) {
				N -= 100;
				coin100++;
			}else if (N >= 50) {
				N -= 50;
				coin50++;
			}else if (N >= 10) {
				N -= 10;
				coin10++;
			}else break;
		}
		totalCoin = coin10 + coin100 + coin50 + coin500;
		System.out.println("동전의 갯수 : " + totalCoin);
	}
	
	

}
