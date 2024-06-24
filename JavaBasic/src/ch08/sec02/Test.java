package ch08.sec02;

// Test 클래스가 Audio, Television 객체의 기능을 사용하는 입장
public class Test {

	public static void main(String[] args) {
		RemoteControl rc = getRemoteControl("audio");
		rc.turnOn();
//		audio.m(); // RemoteControl에 없으므로 x
		
		RemoteControl rc2 = getRemoteControl("tv");
		rc2.turnOn();

	}

	public static Audio getAudio() {
		return new Audio();
	}
	
	public static Television getTelevision() {
		return new Television();
	}
	
	public static RemoteControl getRemoteControl(String clsf) {
		if (clsf.equals("audio")) {
			return new Audio();
		} else if (clsf.equals("tv")) {
			return new Television();
		}
		
		return null;
	}

}

// WebApp DB 사용 Oracle, MySQL, MS-SQL, ....
// 만약 DBMS 마다 java CRUD 작업을 수행할 때 각각 다 다르면???
// 