package ch15.sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		// 추가
		list.add(new Board("제목1", "내용1", "홍길동"));
		list.add(new Board("제목2", "내용2", "이길동"));
		list.add(new Board("제목2", "내용3", "삼길동"));
		list.add(new Board("제목4", "내용4", "사길동"));
		list.add(new Board("제목5", "내용5", "오길동"));
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		
		// 순회
		// for + index
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// for each
		for (Board board : list) {
			System.out.println(board);
		}
		// iterator
		Iterator<Board> itr = list.iterator();
		while (itr.hasNext()) {
			Board board = itr.next();
			System.out.println(board);
		}
		
		// 삭제
//		list.remove(2);
//		System.out.println(list);
		
		// 순회 중 삭제 <= 문제 발생 가능
//		for (int i = 0; i < list.size(); i++) {
//			Board board = list.get(i);
//			if (board.getSubject().equals("제목2")) {
//				list.remove(i);
//			}
//		}
		
		// for + index 는 뒤부터
//		for (int i = list.size() - 1; i >= 0; i--) {
//			Board board = list.get(i);
//			if (board.getSubject().equals("제목2")) {
//				list.remove(i);
//			}
//		}
		
		Iterator<Board> itr2 = list.iterator();
		while (itr2.hasNext()) {
			Board board = itr2.next();
			if (board.getSubject().equals("제목2")) {
				itr2.remove();
			}
		}
		System.out.println(list);

	}

}
