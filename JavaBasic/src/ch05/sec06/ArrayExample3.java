package ch05.sec06;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		// 배열 + 반복문(for)
		// 사용자의 입력을 받은 문자열을 char 배열로 저장
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int length = input.length();
//		char[] chArr = new char[length]; // 주석 처리 안 하면 20번 줄과 겹치기 때문에 안 써도 됨
//		
//		for (int i = 0; i < length; i++) {
//			chArr[i] = input.charAt(i);
//		}
		
		char[] chArr = input.toCharArray();
		for (int i = 0; i < length; i++) {
			System.out.print(chArr[i]); 
		}
		
	}

}
