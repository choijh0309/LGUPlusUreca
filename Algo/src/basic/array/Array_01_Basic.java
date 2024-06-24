package basic.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_01_Basic {

	public static void main(String[] args) {
		// "abbcccddddeeeeeffffggghhiabbcccddddeeeeeffffggghhi"
		// 위 문자열 중 각 알파벳 문자의 사용 횟수 (빈도수)
		// a ~ z 까지 모든 알파벳의 사용 횟수를 출력하세요.
		// 변수 26개, 26가지의 경우 처리??
//		int[] alphaCnt = new int[26]; // alphaCnt[0] = a, alphaCnt[1] = b,....
//		String str = "abbcccddddeeeeeffffggghhiabbcccddddeeeeeffffggghhi";
//		int strLen = str.length();
//		for (int i = 0; i < strLen; i++) {
//			alphaCnt[str.charAt(i) - 'a']++;
//		}
//		
//		for (int i = 0; i < 26; i++) {
//			System.out.println((char) (i + 'a') + " " + alphaCnt[i]);
//		}
		
		// 배열의 맨 앞부터 각 3리씩 일정한 규칙이 있다. 앞 * 중 = 뒤
		// 규칙에 위반되는 쌍이 몇 개인지 출력
//		{
//			int[] intArray = {3,2,6, 3,4,4, 1,4,2, 2,3,6, 1,3,5, 1,5,1, 1,1,1, 2,4,2, 2,2,4};
//			
//			int wrongCnt = 0;
//			int intLength = intArray.length - 2;
//			
//			for (int i = 0; i < intLength; i = i + 3) {
//				// i, i+1, i+2 세 항목 따진다.
//				if (intArray[i] * intArray[i + 1] != intArray[i + 2]) wrongCnt++;
//			}
//			System.out.println(wrongCnt);
//		}
		
		// "XYZEBFFGQOVVPWGFFCEAYX"
		// -->                    <--
		// 좌우 비대칭 문자가 있으면 출력, 전체 비대칭 문자가 몇 개인지 출력
		// 문자열의 길이는 짝수 보장
		{
			String str = "XYZEBFFGQOVVPWGFFCEAYX";
			char[] chArray = str.toCharArray();
			int wrongCnt = 0;
			int center = chArray.length / 2;
			
			for (int l = 0, r = chArray.length - 1; l < center; l++, r--) {
				if (chArray[l] != chArray[r]) {
					System.out.println(chArray[l] + " " + chArray[r]);
					wrongCnt++;
				}
			}
			System.out.println(wrongCnt);
		}
		
	}

}
