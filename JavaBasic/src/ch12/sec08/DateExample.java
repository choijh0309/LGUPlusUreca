package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// java 초기에 제공된 api
		// 간단한 날짜를 다루는 데 편하고 심플
		Date now = new Date();
		System.out.println(now);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
	}

}
