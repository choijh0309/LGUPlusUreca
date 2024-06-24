package ch07.sec02;

public class SmartPhone extends Phone {
	// 부모 클래스에 없어서 추가로 생성
	public boolean wifi;
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
