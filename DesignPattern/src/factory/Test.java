package factory;

public class Test {

	public static void main(String[] args) {
		// 사용하는 쪽인 Test 가 Car 클래스를 인지하고 있어야 한다.
		// Car 대신 SportsCar 로 변경되는 경우 코드를 변경해야 한다.
//		Car car = new Car();
//		SportsCar car = new SportsCar();
		// 만들어진 객체가 Car(), SportsCar() 객체이든 Transportation 인터페이스에 있는
		// 메소드만 사용
//		Transportation car = new Car();
//		Transportation car = new SportsCar();
		
		// Car, Airplane 클래스를 몰라도 문자열로 필요한 객체를 얻을 수 있다.
		// 이 객체는 Transportation interface 를 구현한 것만 알고 있고 그것만 사용
		Transportation t = TransportationFactory.getTransportation("Air");
		t.move();
		
		Transportation t2 = TransportationFactory.getTransportation("Car");
		t2.move();
	}

}
