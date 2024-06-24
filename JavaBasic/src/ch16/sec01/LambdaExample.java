package ch16.sec01;

public class LambdaExample {

	// 파라미터의 type 이 functional interface 이므로 이 파라미터를 통해서 호출할 수 있는 메소드는 딱 하나!
	public static void action(Calculable calculable) {
		calculable.calculate(10, 4);
	}
	
	public static void main(String[] args) {
		// plus
		CalculableImplPlus cp = new CalculableImplPlus();
		action(cp);
		
		// minus
		CalculableImplMinus cm = new CalculableImplMinus();
		action(cm);
		
		// anonymous plus
		action(new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x + y);
			}
		});
		
		// anonymous minus
		action(new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x - y);
			}
		});
		
		action((x, y) -> System.out.println(x + y));
		action((x, y) -> System.out.println(x - y));
	}

}
