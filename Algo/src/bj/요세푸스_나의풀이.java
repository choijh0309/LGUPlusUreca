package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스_나의풀이 {

	static int N, K;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		while (q.size() > 1) {
			for (int i = 0; i < K - 1; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}
		
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}

}

/*
7 3
<3, 6, 2, 7, 5, 1, 4>

*/
