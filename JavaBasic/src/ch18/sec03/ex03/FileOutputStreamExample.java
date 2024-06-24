package ch18.sec03.ex03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("/Users/choijunha/Downloads/무제.png");
		OutputStream os = new FileOutputStream("/Users/choijunha/Downloads/무제2.png");
		
//		byte[] data = new byte[1024]; // read 해서 담을 자료구조의 크기보다 파일이 클 때
//		while (true) {
//			int num = is.read(data);
//			if (num == -1) break;
//			os.write(data, 0, num);
//		}
		
		is.transferTo(os);
		
		os.flush();
		os.close();
		is.close();
	}

}
