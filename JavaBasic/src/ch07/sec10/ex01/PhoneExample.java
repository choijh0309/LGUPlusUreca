package ch07.sec10.ex01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone("홍길동"); // 추상 클래스는 객체를 만들 수 없다.
//		phone.turnOff();
		
		SmartPhone sPhone = new SmartPhone("이길동");
		sPhone.turnOn();
		sPhone.internetSearch();
	}

}
