package ch04.sec07;

public class BreakConitnueExample {

	public static void main(String[] args) {
		// break 5 만나면 종료
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(i);
//			if (i == 5) break;
//		}
		
		// continue 5 만나면 skip
//		for (int i = 0; i < 10; i++) {
//			if (i == 5) continue;
//			System.out.println(i);
//			
//		}
		
		// nested(중첩된)
//		for (int i = 0; i < 10; i++) {
//			if (i == 5) continue;
//			for (int j = 0; j < 10; j++) {
//				System.out.print(i + " " + j + "  ");
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < 10; i++) {
////			if (i == 5) break;
//			for (int j = 0; j < 10; j++) {
//				if (j == 5) break;
//				System.out.print(i + " " + j + "  ");
//			}
//			System.out.println();
//		}
		
		Outter: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) break Outter;
				System.out.print(i + " " + j + "  ");
			}
			System.out.println();
		}

	}

}
/*
*****
****
***
**
* 
*/
