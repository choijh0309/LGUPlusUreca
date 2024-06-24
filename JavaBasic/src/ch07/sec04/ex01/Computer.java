package ch07.sec04.ex01;

public class Computer extends Calculator {
	// overriding
	@Override
	public double areaCircle(double r) {
		System.out.println("Calculator areaCircle()");
		return Math.PI * r * r;
	}
}
