package ch06.sec10.ex03;

public class Car {
	int speed;
	void run() {
		System.out.println(speed + "로 달린다.");
	}
	
	static void simulate() {
		System.out.println("simulate");
		// this 또는 필드에 접근 x // speed = 10;
//		run();
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		Car.simulate();
	}
}
