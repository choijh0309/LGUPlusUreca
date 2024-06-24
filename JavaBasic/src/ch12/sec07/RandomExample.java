package ch12.sec07;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 1. Math.random() 0.0 <= ? < 1.0
		// 정수 랜덤 수를 만드는 데 귀찮은 코드를 작성
		
		// 2.java.util.Random 객체
		Random random = new Random(3); // seed // 3은 난수 생성기의 시드(seed)를 의미합니다. 시드는 난수 생성 알고리즘에서 사용되는 초기값으로, 같은 시드를 사용하면 항상 같은 순서의 난수가 생성됩니다. 따라서 같은 시드를 사용하면 항상 같은 난수가 출력됩니다. 난수란 임의로 생성된 숫자를 의미합니다. 컴퓨터 프로그래밍에서는 난수를 주로 무작위로 데이터를 생성하거나 특정한 확률 분포를 따르는 값을 생성하기 위해 사용합니다.
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(6) + 1);
		}

	}

}
