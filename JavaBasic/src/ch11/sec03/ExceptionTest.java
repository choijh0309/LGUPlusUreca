package ch11.sec03;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
//		int[][] map = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		String[] array = {"100", "20*"};
		
//		for (int i = 0; i <= array.length; i++) {
//			try {
//				int value = Integer.parseInt(array[i]);
//				System.out.println(value);
//			} catch (ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
//			} catch (NumberFormatException e) {
//				System.out.println("숫자 문자열 오류");
//			}
//		}
		
//		for (int i = 0; i <= array.length; i++) {
//			try {
//				String s = null;
//				s.length();
//				int value = Integer.parseInt(array[i]);
//				System.out.println(value);
//			} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//				e.printStackTrace();
//			} catch (Exception e) {
//				System.out.println("기타 예외 발생");
//			}
//		}
		
//		for (int i = 0; i <= array.length; i++) {
//			try {
//				String s = null;
//				s.length();
//				int value = Integer.parseInt(array[i]);
//				System.out.println(value);
//			} catch (Exception e) {
//				System.out.println("기타 예외 발생");
//			} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
}
// 그럼 RuntimeException 을 try-catch 로 처리하는 게 좋은 건가?? 
// RuntimeException은 무조건 잡아야 한다!