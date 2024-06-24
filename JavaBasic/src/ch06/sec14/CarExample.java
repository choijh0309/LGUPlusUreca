package ch06.sec14;

public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
//		car.speed = 10; // 외부에서 car 객체의 필드를 변경
//		
//		// 외부에서 car 객체의 필드를 조
//		System.out.println("car.stop " + car.stop);
		
		car.setSpeed(-10);
		System.out.println("car.stop " + car.isStop());
		System.out.println("car.speed " + car.getSpeed());
	}
	
}
