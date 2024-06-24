package ch02.sec10;

public class PrimitiveStringExample {
	// 문자열 -> int, int -> 문자
	public static void main(String[] args) {
		String str = "10"; // 숫자로 변환하지 못하는 문자열 경우 java.lang.NumberFormatException
		int value1 = Integer.parseInt(str);
		System.out.println(value1);
		
		String str2 = String.valueOf(value1);
		System.out.println(str2);
	}

}
