package ch07.sec10.ex01;

public class SmartPhone extends Phone {

	SmartPhone(String owner) {
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("internet search");
	}

	@Override
	void turnOn() {
		System.out.println("SmartPhone turn on");
	}
}
