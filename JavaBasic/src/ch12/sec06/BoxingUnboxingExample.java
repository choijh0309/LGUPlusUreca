package ch12.sec06;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println(obj);
		System.out.println(obj.intValue());

		// Unboxing
		int value = obj;
		System.out.println(value);
		
		// Unboxing auto
		int result = obj + 100;
		System.out.println(result);
		
	}

}
