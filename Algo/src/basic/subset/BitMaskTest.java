package basic.subset;

public class BitMaskTest {

	public static void main(String[] args) {
		// << 8421
//		System.out.println(1 << 1); // 0001 -> 0010
//		System.out.println(2 << 3); // 0010 -> 0001 0000
//		System.out.println(3 << 2); // 0011 -> 1100
		// & |
		// 0011
		// 0001
		//-----
		// 0001
		System.out.println(3 & 1);
		// 0011
		// 0001
		//-----
		// 0011
		System.out.println(3 | 1);
		// | <<
		// 0011
		// 0100
		//-----
		// 0111
		System.out.println(3 | 1 << 2);
		// & <<
		// 0011
		// 0100
		//-----
		// 0000
		System.out.println(3 & 1 << 2); 
		// & <<
		// 0011
		// 0010
		//-----
		// 0010
		System.out.println(3 & 1 << 1); 	
		// & <<
		// 0111 <- 7 인데 7 자체 보다 bit 의 나열 몇번째가 0 이고 1 인지
		// 0010
		//-----
		// 0010
		System.out.println(7 & 1 << 1); 
		// a & 1 << b <= a 를 bit 표현하면 a 의 b 자리가 1인지 0인지 알 수 있다. 그 결과가 0 이면 그 자리가 0, 0 이 아니면 1 이다.
		// | <<
		// 0111 <- 7 인데 7 자체 보다 bit 의 나열 몇번째가 0 이고 1 인지
		// 1000
		//-----
		// 1111
		System.out.println(7 | 1 << 3); 
		// a | 1 << b <= a 를 bit 표현하면 a 의 b 자리가 1 로 변경함을 알 수 있다.
	}
	
}
