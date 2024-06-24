package ch12.sec05;

import java.util.StringTokenizer;

public class StringExample {

	public static void main(String[] args) {
		// StringBuilder
		String result = "Hello" + "World" + "AAA";
//		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb = new StringBuilder();
//		sb.append("Hello");
//		sb.append("World");
//		sb.append("AAA");
		sb.append("Hello")
			.append("World")
			.append("AAA"); // method chain pattern
		System.out.println(sb);

		
		// 반복문
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			String str = " " + i;
			ans.append(str);
		}
		System.out.println(ans);
		
		// StringTokenizer
		String str = "홍길동,이길동,삼길동";
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		int N = 5;
		String input = "10 27 5 4 19";
		StringTokenizer st2 = new StringTokenizer(input);
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st2.nextToken());
			System.out.println(num);
		}
	}

}
