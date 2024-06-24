package ch06.sec10.ex01;

public class CalculatorExample {
	
	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		double result1 = 10 * 10 * calc.pi;
		double result1 = 10 * 10 * Calculator.pi; // 객체 생성 x
		System.out.println(result1);
		System.out.println(Calculator.plus(5, 10));
		System.out.println(Calculator.minus(5, 10));
		
		int a = 10;
		int b = 20;
		System.out.println(Math.max(a, b));
		System.out.println(Math.abs(a - b));
	}

}
// static 필드나 메소드는 객체별로 존재할 필요없이 모두에게 동일하거나, 단순 기능을 수행하는 목적으로 사용