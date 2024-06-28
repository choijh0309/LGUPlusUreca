package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj_쿼드트리_1992_나의풀이 {

	static int N;
	static char[][] img;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		img = new char[N][];
		for (int i = 0; i < N; i++) {
			img[i] = br.readLine().toCharArray();
		}
		
		QuadTree(0, 0, N);
		System.out.println(sb);
	}
	
	static void QuadTree(int y, int x, int size) {
		// 압축이 가능하면 색상 하나로 압축
		if (isCompressible(y, x, size)) {
			sb.append(img[y][x]);
			return;
		}
		
		// 압축이 불가능하면 사이즈를 나눈다
		int newSize = size / 2;
		
		sb.append('(');
		
		for (int ny = 0; ny < 2; ny++) {
	        for (int nx = 0; nx < 2; nx++) {
	            QuadTree(y + ny * newSize, x + nx * newSize, newSize);
	        }
	    }
		
		sb.append(')');
  	}
	
	// 압축이 가능한지 확인
	static boolean isCompressible(int y, int x, int size) {
		int value = img[y][x];
		
		for (int i = y; i < y + size; i++) {
			for (int j = x; j < x + size; j++) {
				if (value != img[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}

/*
8
11110000
11110000
00011100
00011100
11110000
11110000
11110011
11110011

((110(0101))(0010)1(0001))
*/
