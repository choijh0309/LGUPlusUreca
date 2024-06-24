package basic.delta;

import java.util.Arrays;

// 2차원 배열 (문자)
// if - else 구조의 4방 탐색은 개발자의 실수를 많이 유발
// 상, 하, 좌, 우 이동에 대한 변화량을 미리 배열로 계산
// 상(-1, 0) 하(+1, 0) 좌 (0, -1) 우 (0, +1)
// 한 칸이 이동이 아닌 갈 수 있을 때까지 계속 이동
public class DataTest2 {

	static char[][] map = new char[5][5];
	public static void main(String[] args) {
		char ch = 'A';
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j] = ch++;
			}
		}

		// 출력
		for (int i = 0; i <5; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				print8(i, j);
			}
		}
		
	}

	// delta
	// 상, 하, 좌, 우
	// 순서가 있다. (문제에 따라 순서를 고정시켜야 하는 경우도 존재)
	static int dy4[] = {-1, 1, 0, 0};
	static int dx4[] = {0, 0, -1, 1};
	
	static void print4(int y, int x) {
		System.out.print(map[y][x] + " : ");
		
		for (int d = 0; d < 4; d++) {
			// 반복문으로 구성, ny = y.. -> ny = ny ..
			int ny = y;
			int nx = x;
			
			while (true) {
				ny =  ny + dy4[d];
				nx =  nx + dx4[d];
				
				if (ny < 0 || nx < 0 || ny >= 5 || nx >= 5) break;
				System.out.print(map[ny][nx]);
			}
			
		}
		System.out.println();
	}
	
	// 대각선
	// 좌상, 우상, 좌하, 우하
	static int dy4x[] = {-1, -1, 1, 1};
	static int dx4x[] = {-1, 1, -1, 1};
	
	static void print4x(int y, int x) {
		System.out.print(map[y][x] + " : ");
		
		for (int d = 0; d < 4; d++) {
			int ny = y;
			int nx = x;
			
			while (true) {
				ny =  ny + dy4x[d];
				nx =  nx + dx4x[d];
				
				if (ny < 0 || nx < 0 || ny >= 5 || nx >= 5) break;
				System.out.print(map[ny][nx]);
			}	
		}
		System.out.println();
	}
	
	// 8방
	static int dy8[] = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int dx8[] = {0, 0, -1, 1, -1, 1, -1, 1};
	
	static void print8(int y, int x) {
		System.out.print(map[y][x] + " : ");
		
		for (int d = 0; d < 8; d++) {
			int ny = y;
			int nx = x;
			
			while (true) {
				ny =  ny + dy8[d];
				nx =  nx + dx8[d];
				
				if (ny < 0 || nx < 0 || ny >= 5 || nx >= 5) break;
				System.out.print(map[ny][nx]);
			}
			
		}
		System.out.println();
	}
}
