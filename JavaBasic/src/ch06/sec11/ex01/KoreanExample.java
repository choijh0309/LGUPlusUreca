package ch06.sec11.ex01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("11111-0000000", "유레카");
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

		k1.name = "aaa"; // final 이 아닌 name 만 가능!
		
	}

}
