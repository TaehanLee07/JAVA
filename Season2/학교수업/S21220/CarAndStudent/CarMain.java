package S21220_java20;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println(car1.s + "\n");
		car1.s = "kor";
		
		Car car2 = new Car("자가용1");
		System.out.println("car2.company : " + car2.company+"\ncar2.company : " + car2.model);
		System.out.println(car2.s + "\n");
		car2.s = "usa";
		
		Car car3 = new Car("자가용2" , "하얀색");
		System.out.println("car3.company : " + car3.company+"\ncar3.company : " + car3.model + "\n" + "car3.color : "
		+ car3.color);
		System.out.println(car3.s + "\n");
		car3.s = "rus";
		
		Car car4 = new Car("레저용" , "빨강", 200);
		System.out.println("car4.company : " + car4.company+"\ncar4.company : " + car4.model + "\n" + "car4.color : "
		+ car3.color +"\n" + "car4.maxSpeed : " + car4.maxSpeed);
		System.out.println(car4.s + "\n");
		System.out.println("\nTest : " + car2.model);
		
		
		
		
	}
}
