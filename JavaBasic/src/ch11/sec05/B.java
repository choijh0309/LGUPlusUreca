package ch11.sec05;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B {
	public void mb() throws IOException { // throws 메소드에 표시
		C c = new C();
		try {
			c.mc(); // try-catch, 위로 넘긴다.
			
	
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new IOException(); // 예외를 발생시키는 코드
		}
		
//		c.mc(); 
	}
}
