package ch05.sec03;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		String str1 = new String("Hello"); // heap 1000번지
		String str2 = new String("Hello"); // heap 2000번지
		
		System.out.println(num1 == num2);
		System.out.println(str1 == str2);
		
		// JVM 은 literal 을 최대한 재사용하려고 한다.
		// 문자열 literal 을 코드에서 처음 사용하면 재사용을 위해 별도의 공간에 저장	
		String str3 = "Hello"; // new(X) literal // heap 에 없냐? (O) // 보통 메소드 영역의 스레드풀에 있
		String str4 = "Hello"; // new(X) literal
		System.out.println(str3 == str4);

	}

}
