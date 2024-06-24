package ch07.sec11;

public final class Manager extends Person { // Person 을 상속하고 더 이상 상속 허락 x
	public void work() {
		System.out.println("Manager 일을 합니다.");
	}
}
