package ch13.sec01.ex01;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.content = "Hello";
		Box<Integer> box2 = new Box<>();
		box2.content = 3;
		
//		box2.content = "Hello";

	}

}
