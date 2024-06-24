package ch13.sec02.ex03;

public class GenericExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "100";
		
		Box<String> box2 = new Box<>();
		box2.content = "200";
		
		System.out.println(box1.compare(box2));

		Box<Integer> box3 = new Box<>();
		box3.content = 100;
		
		Box<Integer> box4 = new Box<>();
		box4.content = 100;
		
		System.out.println(box3.compare(box4));
		
		Box<MyClass> box5 = new Box<>();
		box5.content = new MyClass();
		box5.content.str = "즐거운금요일";
		
		Box<MyClass> box6 = new Box<>();
		box6.content = new MyClass();
		box6.content.str = "즐거운금요일";
		
		System.out.println(box5.compare(box6));
	}

}
