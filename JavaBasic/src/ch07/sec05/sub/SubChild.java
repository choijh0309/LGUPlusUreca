package ch07.sec05.sub;

import ch07.sec05.Parent;

public class SubChild extends Parent{
	public void m() {
		Parent parent = new Parent();
		parent.m2();
//		parent.m3();
	}
	
	public void m5() {
		m1();
		m3();
//		m4();
	}
}
