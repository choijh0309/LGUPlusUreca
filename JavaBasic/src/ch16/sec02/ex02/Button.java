package ch16.sec02.ex02;

// Button 이 클릭되었을 때 실제 수행되는 코드를 가지고 있지 않다.
// 수행되는 코드는 객체가 만들어 지는(사용되는) 시점에 외부에서 받는다.
public class Button {
	
	// Button 내부의 interface <= 이 버튼 안에서만 쓰겠다.
	@FunctionalInterface
	public static interface ClickListener { // ~~Listener, ~~Handler 
		void onClick(); // public abstract 생략
	}
	
	// 필드
	private ClickListener clickListener;
	
	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	
	// 이 버튼이 클릭되면 호출되는 메소드
	// 클릭되었을 때 수행하는 코드는 Functional interface 의 메소드 호출 <= function interface 의 구현체는 외부에서 lambda 로
	public void click() {
		this.clickListener.onClick();
	}
}
