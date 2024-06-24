package ch11.sec02.ex01;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("예외 테스트");
		try {
			printLength("Java");
			String s = null;
			printLength(s);
		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
		} finally {
			System.out.println("finally block");
		}
		
	}
	// 위로 넘어감
	public static void printLength(String data) {
		
		int result = data.length();
		System.out.println("문자수 : " + result);
	}
}

// 예외는 처리되지 않으면 호출한 메소드를 넘어간다.
// 1.RuntimeException 자동 
// 2.CheckedException 수동
