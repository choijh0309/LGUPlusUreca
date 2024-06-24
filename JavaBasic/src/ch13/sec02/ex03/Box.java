package ch13.sec02.ex03;

public class Box<T> {
	public T content;
	
	// 두 Box 객체의 비굑를 위한 메소드
	// equals() 로 비교
	public boolean compare(Box<T> other) {
		return this.content.equals(other.content);
	}
}
