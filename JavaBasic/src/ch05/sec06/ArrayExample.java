package ch05.sec06;

public class ArrayExample {

	public static void main(String[] args) {
		// 선언
		int[] n; // 일반적인 표
		int n2 [];
		
		// 생성
		int[] intArray = new int[5]; // 변수와 heap 배열 공간만 확보
	
		int[] intArray2 = {1, 2, 3, 4, 5}; // 변수와 heap 배열 공간 + value
		
		int[] intArray3 = new int[]{1, 2, 3, 4, 5}; // 변수, heap 공간, value
		
		int a  = 10, b = 20;
		
//		int[] intArray4 = {a, b};
//		int[] intArray4;
//		intArray4 = {a, b}; // 오류
		
//		int[] intArray5 = new int[]{a, b};
		int[] intArray5;
		intArray5 = new int[] {a, b};
		
		System.out.println(intArray2 == intArray3);
		
		int[] intArray6 = {1, 2, 3, 4, 5}; // 변수와 heap 배열 공간 + value
		
		System.out.println(intArray2 == intArray6); // array constant false
		
		String[] strArray = {"Hello", "Java", "유레카"};
		String[] strArray2 = new String[3];
		String[] strArray3 = new String[] {"a", "b", "c"};
		
		System.out.println(intArray[2]);
		System.out.println(strArray2[2]);
		System.out.println(strArray2.length);
		System.out.println(strArray2[0].length());

	}

}
