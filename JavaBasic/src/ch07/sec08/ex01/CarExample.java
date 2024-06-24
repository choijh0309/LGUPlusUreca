package ch07.sec08.ex01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
//		car.tire = new Tire();
//		car.tire = new HankookTire();
		car.tire = new KumhoTire();
		car.run();

	}

}
