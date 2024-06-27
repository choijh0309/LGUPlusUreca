package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_DFS와BFS프로그램문제_1260 {
	static int N, M, V; // 노드 개수, 간선 개수, 시작점
	static boolean[] visited;
    static List<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }
        
        // 방문할 수 있는 노드가 여러 개면 작은 것부터 방문 위해 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }
        
        visited = new boolean[N + 1];
        DFS(V);
        System.out.println();
        
        visited = new boolean[N + 1];
        BFS(V);
        System.out.println();
    }

    public static void DFS(int Node) {
        System.out.print(Node + " ");
        visited[Node] = true;
        for (int i : A[Node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int Node) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(Node);
        visited[Node] = true;
        
        while (!queue.isEmpty()) {
            int now_Node = queue.poll();
            System.out.print(now_Node + " ");
            for (int i : A[now_Node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

}

/*
4 5 1
1 2
1 3
1 4 
2 4
3 4

1 2 4 3
1 2 3 4
*/
