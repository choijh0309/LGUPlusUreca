package ch08.sec05;
// 전원 켜는 기능에 대한 약속, 규칙 공유
public interface RemoteControl {
	int MAX_VOLUME = 10; // public static final 생략
	int MIN_VOLUME = 0;
	
	void turnOn(); // public abstract 생략
	void turnOff(); 
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리");
			setVolume(MIN_VOLUME); // 구현부를 가지는 default 메소드에서 위 추상 메소드를 호출
		} else {
			System.out.println("무음 해제");
		}
	}
}
