package ch09.sec07.ex01;

public class Car {
	// 필드
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() { // 익명 자식 객체 생성 <= 이 객체는 이 곳에서만 쓰고 말 거다. 재사용 X
		@Override
		public void roll() {
			System.out.println("익명 타이어가 굴러갑니다.");
		}
	};
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}
}
