package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton st1 = new Singleton();
//		Singleton st2 = new Singleton();
//		Singleton st3 = new Singleton();
//		Singleton st4 = new Singleton();

		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		Singleton st3 = Singleton.getInstance();
		Singleton st4 = Singleton.getInstance();
		
		System.out.println(st1 == st4);
	}

}
