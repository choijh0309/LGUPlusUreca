package ch02.sec13;

import java.util.Scanner;

// compiler 가 자동으로 해주는 작업 #1 <- java.lang package 는 자동으로 import 해 준다.
public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ctrl + shift + O <= 자동 import
		System.out.println("정수값 입력 : ");
		int input = sc.nextInt();
		System.out.println(input);
	}

}
