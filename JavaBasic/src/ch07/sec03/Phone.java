package ch07.sec03;

public class Phone {
	// encapsulation 생각을 늘 합시다.
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	public Phone() {} // 기본 생성자 만들기
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

}
