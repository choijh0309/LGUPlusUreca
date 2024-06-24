package ch18.sec02.ex02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("/Users/choijunha/Downloads/test2.db");
			
			byte[] array = {40, 50, 60, 70};
			
			os.write(array);
			
			os.flush();
			os.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
