package ch11.sec02.ex02;

import java.io.IOException;

public class ExceptionTest3 {

//	public static void main(String[] args) throws ClassNotFoundException {
//		// 대응 ? 2가지
//		// #1 나도 throws 할래
//		Class.forName("java.lang.String");
//	}
	
	public static void main(String[] args) {
		// 대응 ? 2가지
		// #2 try-catch-finally
		try {
			Class.forName("java.lang.String222");
		} catch (ClassNotFoundException e) {
			System.out.println("class 를 찾을 수 없습니다.");
		} finally {
			System.out.println("finally");
		}
		
		try {
			myMethod();
		} catch (IOException e) {
			System.out.println("class 를 찾을 수 없습니다.");
		} finally {
			System.out.println("finally");
		}
		
	}
	
	public static void myMethod() throws IOException {
		// IO 작업을 하다가 IO 예외가 발생할 수 있다.
	}
}

