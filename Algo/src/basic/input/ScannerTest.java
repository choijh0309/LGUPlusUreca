package basic.input;

import java.util.Arrays;
import java.util.Scanner;

//Scanner : 편하다. 다소 무겁다.
public class ScannerTest {

	public static void main(String[] args) {
		// 1 2 3 4 5
//		{
//			Scanner sc = new Scanner(System.in);
//			int[] input = new int[5];
//			
//			for (int i = 0; i < 5; i++) {
//				input[i] = sc.nextInt();
//			}
//			
////			for (int i = 0; i < 5; i++) {
////				System.out.println(input[i]);
////			}
//			System.out.println(Arrays.toString(input));
////			sc.close();
//		}
		
		// 1 A 3 B 5
//		{
//			Scanner sc = new Scanner(System.in);
//			char[] input = new char[5];
//					
//			for (int i = 0; i < 5; i++) {
//				input[i] = sc.next().charAt(0); // "1", "2" ...
//			}
//					
//			System.out.println(Arrays.toString(input));
//		}
		
		// XYZQU
//		{
//			Scanner sc = new Scanner(System.in);
//			char[] input = sc.nextLine().toCharArray();; // "XYZQU" -> ['X', 'Y',..]
//					
//			System.out.println(Arrays.toString(input));
//		}
		
/*
6
1 2 3 4 5 1		 
 */
//		{
//			Scanner sc = new Scanner(System.in);
//			int N = sc.nextInt();
//			int[] input = new int[N];
//			
//			for (int i = 0; i < N; i++) {
//				input[i] = sc.nextInt();
//			}
//			System.out.println(Arrays.toString(input));
//		}
		
/*
5
XYZQU		
*/
		{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			sc.nextLine(); // 남아 있는 빈 개행문자('\n')를 처리
	//		int[] input = new int[N]; // 낭비
			char[] input = sc.nextLine().toCharArray();; // "XYZQU" -> ['X', 'Y',..]
					
			System.out.println(Arrays.toString(input));
		}

	}

}
