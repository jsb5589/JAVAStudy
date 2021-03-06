package section05.s03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		// [버퍼 미사용]
		FileInputStream fis1 = new FileInputStream("D:/Temp/Java/house.jpg");
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {}
		
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();
		
		// [버퍼사용]
		FileInputStream fis2 = new FileInputStream("D:/Temp/Java/house.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용했을 때: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}
}

