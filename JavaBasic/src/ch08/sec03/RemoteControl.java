package ch08.sec03;
// 전원 켜는 기능에 대한 약속, 규칙 공유
public interface RemoteControl {
	int MAX_VOLUME = 10; // public static final 생
	int MIN_VOLUME = 0;
	
	void turnOn(); 
}
