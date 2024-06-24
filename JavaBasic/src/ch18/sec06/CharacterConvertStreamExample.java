package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("한글입니다.");
		String data = read();
		System.out.println(data);

	}

	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("/Users/choijunha/Downloads/test.txt"); // byte[] 
		Writer writer = new OutputStreamWriter(os, "utf-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		InputStream is = new FileInputStream("/Users/choijunha/Downloads/test.txt"); // byte[] 
		Reader reader = new InputStreamReader(is, "ms949");
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		return new String(data, 0, num);
	}
}
