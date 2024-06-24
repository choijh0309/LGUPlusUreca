package ch07.sec04.ex00;

public class Parent {
	public B m1() { return new B(); }
	
	public void m2() throws RuntimeException {
		
	}
}

// 재정의를 하면서 리턴 타입이 부모보다 더 상위 타입을 가지면 안 된다.
//class Child extends Parent {
//	@Override              
//	public A m1() { return new A(); }
//}

// 재정의를 하면서 접근제한자가 부모보다 더 좁힐 수 없다.
//class Child extends Parent {
//	B m1() { return new B(); }
//}

class Child extends Parent {
//	@Override
//	public void m2() throws NullPointerException {
//		
//	}
	// 재정의를 하면서 부모보다 더 넓은 예외를 throws 할 수 없다.
//	@Override
//	public void m2() throws Exception {
//		
//	}
}