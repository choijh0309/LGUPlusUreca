package ch12.sec03.ex01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// println(객체) <- 객체.toString()
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj3);
		
		// == 객체의 참조(주소, 번지) 값 비교
		System.out.println(obj1 == obj2); 
		System.out.println(obj2 == obj3); 
		
		// blue 에 대한 equals() 비교
		// equals() 는 Object 의 equals() 상속
		// Object 의 equals() 는 == 사용
		System.out.println(obj1.equals(obj2)); 

	}

}
