package ch03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 리팩토링 + 2차원 배열 사용
public class 숫자카드게임_2 {

	static int n, m, result;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        map = new int[n][m];
        
        for (int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine()); // 한 줄 읽어서 token 처리
        	for (int j = 0; j < m; j++) {
        		map[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        for (int i = 0; i < n; i++) {
        	// 각 행별로 가장 작은 수 선택
        	int min_value = 10001;
        	for (int j = 0; j < m; j++) {
        		min_value = Math.min(min_value, map[i][j]);
        	}
        	result = Math.max(result, min_value);
        }
       

        System.out.println(result); // 최종 답안 출력
	}

}

/*
3 3 
3 1 2
4 1 4
2 2 2

2
*/