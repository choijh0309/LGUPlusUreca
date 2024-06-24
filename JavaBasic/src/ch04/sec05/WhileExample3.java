package ch04.sec05;

import java.util.Scanner;

public class WhileExample3 {
	// for(횟수가 예측가능할 때), while(횟수가 예측불가능할 때)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // cmd + shift + o
		boolean run = false;
		int speed = 0;
		
		do {
			// 작업 수행
			// 수행에 영향을 미치는 조건 처리
			System.out.println("----------------------------");
			System.out.println("1:증속 | 2:감속 | 3:중지");
			System.out.println("선택 : ");
			// 사용자 입력
			int num = sc.nextInt();
			
			if (num == 1) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if (num == 2) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if (num == 3) {
				run = false;
			}
		} while(run);
		
		System.out.println("종료");
	}

}
