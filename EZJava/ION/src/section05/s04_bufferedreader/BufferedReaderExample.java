package section05.s04_bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {		
		Reader reader = new FileReader("D:/Temp/wise.txt"); 	
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String lineString = br.readLine(); // CRLF ������ ����(CRLF�� �ڸ�)
			if(lineString == null) {
				break;
			}
			System.out.println(lineString);
		}
	}
}