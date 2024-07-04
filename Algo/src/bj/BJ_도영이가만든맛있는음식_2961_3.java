package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 부분집합
// binary counting
public class BJ_도영이가만든맛있는음식_2961_3 {

	static int N, min;
	static int[][] src; // 재료 (신, 쓴)

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 재료
		src = new int[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			src[i][0] = Integer.parseInt(st.nextToken());
			src[i][1] = Integer.parseInt(st.nextToken());
		}

		min = Integer.MAX_VALUE;
		
//		int subsetCnt = (int) Math.pow(2, N);
		int subsetCnt = 1 << N ;
		
		for (int i = 1; i < subsetCnt; i++) { // 0은 제외
			int sin = 1;
			int ssn = 0;
			
			for (int j = 0; j < N; j++) {
				if ((i & (1 << j)) != 0) {
					sin *= src[j][0];
					ssn += src[j][1];
				}
				min = Math.min(min, Math.abs(sin - ssn));
			}
			
		}
		
		System.out.println(min);
	}

//	static void subset(int srcIdx, int mask) {
//		if (srcIdx == N) {
//			// 부분집합의 한 경우가 만들어진 상태
//			// 문제의 경우를 따지면 된다.
//			// select true 인 재료를 사용
//			int sin = 1;
//			int ssn = 0;
//			int cnt = 0;
//			
//			for (int i = 0; i < N; i++) {
//				if ((mask & (1 << i)) != 0) { // mask 의 bit 표현 중 i 번째가 1 인지 0 인지 확인
//					sin *= src[i][0]; // 신
//					ssn += src[i][1]; // 쓴
//					cnt++;
//				}
//			}
//			
//			if (cnt > 0) {
//				min = Math.min(min, Math.abs(sin - ssn)); // 절대값
//			}
//			return;
//		}
//		
//		subset(srcIdx + 1, mask | 1 << srcIdx); // 현재 재료 선택
//		
//		subset(srcIdx + 1, mask); // 현재 재료 (srcIdx) 선택 X
//	}
}