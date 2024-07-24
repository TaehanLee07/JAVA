package class1;

public class productOrderMain {
	public static void main(String[] args) {
		
		productOrder[] productArr = new productOrder[3];
		// orders[0] = new productOrder();
		productOrder po1 = new productOrder();
		po1.productOrder = "두부";
		po1.price = 2000;
		po1.quantity = 2;
		productArr[0] = po1;
		
		productOrder po2 = new productOrder();
		po2.productOrder = "김치";
		po2.price = 5000;
		po2.quantity = 1;
		productArr[1] = po2;
		
		productOrder po3 = new productOrder();
		po3.productOrder = "콜라";
		po3.price = 1500;
		po3.quantity = 2;
		productArr[2] = po3;
		
		int total = 0;
		
		for(productOrder order : productArr) {
			System.out.println("상품명 : " + order.productOrder + " 가격 : " + order.price + " 수량 : " + order.quantity);
			total += order.price * order.quantity;
		}
		System.out.println("총 금액 : " + total);
	}	
}
