package builder;

public class Test {

	public static void main(String[] args) {
		NormalBook nBook = new NormalBook();
		nBook.setIsbn("111");
		nBook.setTitle("제목1");

		NormalBook nBook2 = new NormalBook("222", "이길동", "제목2"); // 순서 오류
		// 적당한 filed 를 set 할 수 있는 적당한 생성자를 추가로 요구
		
		BuilderBook bBook = BuilderBook.builder()
										.title("제목2")
										.isbn("222")
										.author("이길동");
		System.out.println(bBook);
	
	
		// Board
		Board board = new Board.Builder()
								.title("제목3")
								.content("제목3")
								.category("분류1")
								.build();
		System.out.println(board);
	
	}

}
