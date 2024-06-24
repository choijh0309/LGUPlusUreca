package ch16.sec01;

@FunctionalInterface // 딱 하나만 가질 수 있음
public interface Calculable {
	void calculate(int x, int y);
}
