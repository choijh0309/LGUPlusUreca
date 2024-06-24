package ch07.sec08.ex00;

public class Test {

	public static void main(String[] args) {
//		B x = new C();
//		x.m(10);
		
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		D d = new D();
//		
//		System.out.println(d instanceof A); // True
//		System.out.println(d instanceof B); // True
//		System.out.println(d instanceof C); // True
//		System.out.println(d instanceof D); // True
		
//		A x = getInstance();
//		System.out.println(x instanceof A);
//		System.out.println(x instanceof B);
//		System.out.println(x instanceof C);
//		System.out.println(x instanceof D);
		
		A x = getInstance();
		// A 객체이면.. B 객체이면.. specific -> general 순으로
		if (x instanceof D) {
			System.out.println("D 객체");
//			x.d();
			D d = (D) x; 
			d.d(); 
		}
		else if (x instanceof C) System.out.println("C 객체");
		else if (x instanceof B) System.out.println("B 객체");
		else if (x instanceof A) System.out.println("A 객체");
		else if (x instanceof Object) System.out.println("Object 객체");
		
	}
	
	public static A getInstance() {
		return new D();
	}
}

class A {
	public void m() {System.out.println("A m()");}
	public void m(int n) {System.out.println("A m(int n)");}
}

class B extends A {
	public void m() {System.out.println("B m()");}
}

class C extends B {
//	public void m(int n) {System.out.println("C m(int n)");}
}

class D extends C {
	public void m() {System.out.println("D m()");}

	public void d() {}
}