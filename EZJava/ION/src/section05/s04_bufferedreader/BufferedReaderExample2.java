/*
 * 
 */
package section05.s04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample2 {
	public static void main(String[] args) throws Exception {		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);	
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("�Է�: ");
		String lineString = br.readLine(); // CRLF�� ���е� �� ������ ���ڿ��� �Ѳ����� ���� �� �ִ�.
		
		System.out.println("���: " + lineString);	
	}
}