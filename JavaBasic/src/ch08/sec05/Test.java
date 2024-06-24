package ch08.sec05;

public class Test {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(-10);
		rc.setMute(true);
		rc.setMute(false);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();

		rc.setMute(true); // default method 호출
		rc.setMute(false);
	}

}
