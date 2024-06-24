package singleton;

import java.time.LocalDateTime;

// app 전체에서 log 를 담당하는 클래스
// 이 클래스의 객체는 단 한개만 만들어서 사용되도록 한다.
public class Logger {
	
//	static {
//		// 미리 선 작업...
//		logger = new Logger();
//	}
	
	// private static Logger 변수
//	private static Logger Logger = new Logger();
	private static Logger logger;
	
	// 생성자를 private 로
	private Logger() {}
	
	// static 메소드로 외부에서 객체를 얻을 수 있는 방법 제공
	public static Logger getInstance() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	public void log(String message) {
		LocalDateTime ldt = LocalDateTime.now();
		String date = ldt.getYear() + "/" + ldt.getMonthValue() + "/" + ldt.getDayOfMonth();
		String time = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();
		
		System.out.println("[" + date + " " + time + "] " + message);
	}
}

// 객체는 만들어진다. static으로 정적으로 할 뿐
