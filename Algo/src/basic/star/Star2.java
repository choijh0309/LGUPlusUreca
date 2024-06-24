package basic.star;

public class Star2 {

	public static void main(String[] args) {
		// 반복문 + 출력 + 반전 시점
		// 반전 : 정확히 반인 곳에서 공백 기준으로 점점 증가? 점점 감소? 판단 <= 밑으로 가면서
		// 옆으로(열) 가면서 공백 출력 나머지 조건 (전체 7 중 공백 뺀 만큼)
		
		int turnCnt = 7  / 2; // 3.5 x 3 으로 정수 처리
		int spaceCnt = 0;
		boolean spaceIncrease = true; // 공백문자 수 증가?? 감소??
		
		for (int i = 0; i < 7; i++) {
			// 1. 출력하지 않을 부분까지 따진다.
//			for (int j = 0; j < 7; j++) {
//				if (j < spaceCnt) {
//					System.out.print(" ");
//				} else if (j < 7 - spaceCnt) {
//					System.out.print("*");
//				}
//			}
			
			// 2. 출력할 부분까지만 따진다.
//			for (int j = 0; j < 7 - spaceCnt; j++) {
//				if (j < spaceCnt) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
			
			// 3. 앞 공백, 뒤 별 출력 순서가 명백하므로 for 문 분리해서 if 조건 체크 제거
			for (int j = 0; j < spaceCnt; j++) {
				System.out.print(" ");
				
			}
			for (int j = spaceCnt; j < 7 - spaceCnt; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			// 행 별 출력이 완료 => 공백 증가 감소 판단
			if (spaceIncrease) {
				spaceCnt++;
			} else {
				spaceCnt--;
			}
			
			if (spaceCnt == turnCnt) { // 다음 행부터 감소로 변경
				spaceIncrease = false;
			}
		}
		
		// 나의 풀이
//		int n = 7;
//		int mid = n / 2;
//		
//		for (int i = 0; i <= n / 2; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < n - 2 * i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = mid - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < n - 2 * i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
	}
	
}
