package ch06.sec10.ex02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	// 메모리에 load 될 때 실행되는 block
	static {
		System.out.println("static...");
		info = company + "-" + model;
	}
	
	static {
		System.out.println("static 2...");
	}
}
