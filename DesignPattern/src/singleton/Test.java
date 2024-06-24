package singleton;

public class Test {

	public static void main(String[] args) {
//		Logger logger = new Logger();
//		Logger logger2 = new Logger();
		// 객체를 만들던가 x
		// static ???
		
		Logger logger = Logger.getInstance();
		System.out.println(logger);
		logger.log("첫 번째 로그입니다.");
		
		m();
	}
	
	public static void m() {
		Logger logger = Logger.getInstance();
		System.out.println(logger);
		logger.log("두 번째 로그입니다.");
	}
}
