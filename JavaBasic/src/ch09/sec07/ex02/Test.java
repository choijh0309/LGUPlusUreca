package ch09.sec07.ex02;

public class Test {

	public static void main(String[] args) {
		Home home = new Home();
		home.use();
		home.use2(new RemoteControl() { // 익명, 동적

			@Override
			public void turnOn() {
				System.out.println("익명 인터페이스 파라미터 turnOn");
				
			}
			
		});
	}

}
