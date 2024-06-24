package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputExample {

	public static void main(String[] args) throws Exception {
//		OutputStream os = new FileOutputStream("primitive.db");
//		DataOutputStream dos = new DataOutputStream(os);
//		
//		dos.writeUTF("홍길동");
//		dos.writeDouble(99.1);
//		int num = 100;
//		dos.writeInt(num);
//		
//		dos.writeUTF("이길동");
//		dos.writeDouble(89.1);
//		num = 200;
//		dos.writeInt(num);
//		
//		dos.flush();
//		dos.close();
//		os.close();
		
		InputStream is = new FileInputStream("primitive.db");
		DataInputStream dis = new DataInputStream(is);
		
		for (int i = 0; i < 2; i++) {
			System.out.print(dis.readUTF());
			System.out.print(dis.readDouble());
			System.out.print(dis.readInt());
			System.out.println();
		}
		
		dis.close();
		is.close();
	}

}
