package ch03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 리팩토링 + 2차원 배열 사용
// 2차원 배열 제거, 입력받으면서 바로 처리
public class 숫자카드게임_3 {

	static int n, m, result;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
//        map = new int[n][m];
//        
//        for (int i = 0; i < n; i++) {
//        	
//        	
//        	for (int j = 0; j < m; j++) {
//        		map[i][j] = Integer.parseInt(st.nextToken());
//        	}
//        }
        
        for (int i = 0; i < n; i++) {
        	// 각 행별로 가장 작은 수 선택
        	int min_value = 10001;
        	st = new StringTokenizer(br.readLine()); // 한 줄 읽어서 token 처리
        	for (int j = 0; j < m; j++) {
        		int input = Integer.parseInt(st.nextToken());
        		min_value = Math.min(min_value, input);
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