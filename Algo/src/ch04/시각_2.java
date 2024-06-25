package ch04;

import java.util.Scanner;

// 문자열로 처리하지 않고, 숫자로 처리하는 부분 OK
// 시, 분, 초를 나누어서 따로 처리하는 부분 OK
// || vs | 
public class 시각_2 {

	// 특정한 시각 안에 '3'이 포함되어 있는지의 여부
//    public static boolean check(int h, int m, int s) {
//        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
//            return true;
//        return false;
//    }

	static int N, cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // H를 입력받기 
        N = sc.nextInt();
        int cnt = 0;
        
        long start = System.nanoTime();

        for (int h = 0; h <= N; h++) {
        	if (h % 10 == 3) {
        		cnt += 3600;
        		continue;
        	}
            for (int m = 0; m < 60; m++) {
            	if (m / 10 == 3 || m % 10 == 3) {
            		cnt += 60;
            		continue;
            	}
                for (int s = 0; s < 60; s++) {
                	if (s / 10 == 3 || s % 10 == 3) {
                		cnt++;
                	}
                }
            }
        }
        
        long end = System.nanoTime();

        System.out.println(cnt);
        System.out.println(end - start);
	}

}
// 5 11475