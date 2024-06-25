package ch04;

import java.util.Scanner;

public class 왕실의나이트_2 {
	
	static int y, x, result;
	// 나이트가 이동할 수 있는 8가지 방향 정의
    static int[] dy = {-1, -1, 1, 1, -2, -2, 2, 2};
    static int[] dx = {-2, 2, -2, 2, -1, 1, -1, 1};
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        y = inputData.charAt(1) - '0';
        x = inputData.charAt(0) - 'a' + 1;

        if (y > 2 && y < 7 && x > 2 && x < 7) {
        	System.out.println(8);
        	return;
        }
        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        for (int d = 0; d < 8; d++) {
            // 이동하고자 하는 위치 확인
            int ny = y + dy[d];
            int nx = x + dx[d];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (ny < 1 || nx < 1 || ny > 8 || nx > 8) continue;
                result += 1;
        }

        System.out.println(result);
    }
}

/*
a1

2
*/