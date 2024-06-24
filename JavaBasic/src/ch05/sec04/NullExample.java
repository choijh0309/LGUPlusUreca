package ch05.sec04;

public class NullExample {
	// NullPointerException <- RuntimeException (컴파일 타임에는 check 하지 않음)
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);
		System.out.println(str.length());
		// a.m().m2()...
		
		String str2 = new String("Hello");
		System.out.println(str2.length());
	}
}
