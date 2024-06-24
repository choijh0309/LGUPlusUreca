package ch09.sec07.ex02;

public class Home {
	private RemoteControl rc = new RemoteControl() { // 익명, 동적

		@Override
		public void turnOn() {
			System.out.println("익명 인터페이스 turnOn");
			
		}
		
	};
	
	public void use() {
		rc.turnOn();
	}
	
	public void use2(RemoteControl rc) {
		rc.turnOn();
	}
}
