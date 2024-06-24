	package ch07.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		B b2 = new C();
		B b3 = new D();
		
//		B b4 = new A();
		
		C c = new D();
		
		// 상속 모든 클래스의 최상위 클래스는 Object

	}

}

class A extends Object {}
class B extends A{}
class C extends B{}
class D extends C{}
