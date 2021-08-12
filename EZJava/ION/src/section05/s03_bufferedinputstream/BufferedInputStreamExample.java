package section05.s03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		// [���� �̻��]
		FileInputStream fis1 = new FileInputStream("D:/Temp/Java/house.jpg");
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {}
		
		end = System.currentTimeMillis();
		System.out.println("���۸� ������� �ʾ��� ��: " + (end-start) + "ms");
		fis1.close();
		
		// [���ۻ��]
		FileInputStream fis2 = new FileInputStream("D:/Temp/Java/house.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		
		end = System.currentTimeMillis();
		System.out.println("���۸� ������� ��: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}
}

