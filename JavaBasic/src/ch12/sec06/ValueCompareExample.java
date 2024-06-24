package ch12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		// Wrapper 클래스의 객체는 primitive type 비교를 위해서는 equals() 사용해야 한다.
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		Integer obj3 = 100;
		Integer obj4 = 100;
		// Wrapper 클래스의 객체는 primitive type 비교를 위해서는 equals() 사용해야 한다.
		// 단, 작은 범위( -128 ~ 127) 는 동일 객체로 JVM 이 관리한다.
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));

	}

}
