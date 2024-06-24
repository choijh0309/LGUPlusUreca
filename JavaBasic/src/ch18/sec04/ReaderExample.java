package ch18.sec04;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception {
		// 문자
		Reader reader = new FileReader("/Users/choijunha/Downloads/test.txt");
		
		// 1문자씩;
		while (true) {
			int data = reader.read();
			if (data == -1) break;
			System.out.print((char)data); // 숫자(문자의 정수 표현) 대신 문자로 표현하기 위해 casting
		}
		reader.close();
		
		reader = new FileReader("/Users/choijunha/Downloads/test.txt");
		
		// 배열에
		char[] data = new char[100];
		int num = reader.read(data);
		for (int i = 0; i < num; i++) {
			System.out.print(data[i]);
		}
		
		reader.close();
	}

}
