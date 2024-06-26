package bj;

import java.util.Scanner;

// 완탐 - dfs
public class BJ_설탕배달_2839 {

	static int N, min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		min = 5000;
		
		dfs(0, 0); // 5kg 0개, 3kg 0개
		
		min = min == 5000 ? -1 : min;
		System.out.println(min);
	}
	
	static void dfs(int five, int three) { // 5kg 몇개, 3kg 몇개
		// 기저조건
		int sum = five * 5 + three * 3;
		
		if (sum == N) { // 성공한 경우
			min = Math.min(min, five + three); // 최소값 갱신
			return;
		} else if (sum > N) {
			return; // 실패한 경우
		}
		
		dfs(five + 1, three);
		dfs(five, three + 1);
	}

}

/*
18

4

4

-1
*/