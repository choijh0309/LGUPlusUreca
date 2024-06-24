package ch07.sec03;

public class SmartPhone extends Phone {
	// 부모 클래스에 없어서 추가로 생성
	public boolean wifi;
	public String color = "blue"; 
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
		System.out.println(super.model);
		System.out.println(super.color);
		System.out.println(this.model);
		System.out.println(this.color);
	}
	
	public SmartPhone() {}  // 기본 생성자 만들기
	public SmartPhone(boolean wifi) {
		this.wifi = wifi;
	}
	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color);
		this.wifi = wifi;
	}
}
// this() this.
// super() super.