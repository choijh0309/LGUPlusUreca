package basic.subset;

// 부분집합은 조합의 합
public class Subset_Basic {
	
	static int[] src = {1, 2, 3, 4, 5};
	static boolean[] select = new boolean[src.length];
	
	public static void main(String[] args) {
		subset(0);
	}
	
	static void subset(int srcIdx) {
		// 기저조건
		if (srcIdx == src.length) {
			printSubset();
			return;
		}
		
		// 현재 srcIdx 에 대해서 선택, 비선택 이어간다.
		select[srcIdx] = true; // 선택
		subset(srcIdx + 1);
		
		select[srcIdx] = false; // 비선택
		subset(srcIdx + 1);
	}
	
	static void printSubset() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < select.length; i++) {
			if (select[i]) sb.append(src[i]).append(" ");
		}
		
		System.out.println(sb);
	}

}
