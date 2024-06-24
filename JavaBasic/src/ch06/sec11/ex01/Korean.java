package ch06.sec11.ex01;

public class Korean {
	final String nation = "korea";
	final String ssn; // 오류 -> 오류 x <= 생성자에서 ssn 값이 정해진다.
	String name;
	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
//	public Korean(String nation,String ssn, String name) {
//		this.nation = nation;
//		this.ssn = ssn;
//		this.name = name;
//	}
}
