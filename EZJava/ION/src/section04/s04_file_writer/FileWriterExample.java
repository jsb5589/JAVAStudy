/*
 * FileWriter(File, append)
 * append : ������ �����ϸ� ������ �߰����� ���� ���� ����
 *   - true : ������ ������ �����ϸ鼭 ���ο� ������ �߰�
 *   - false : ���� ����
 */
package section04.s04_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("D:/Temp/test-1.txt");	
		
		boolean append = false;
		FileWriter fw = new FileWriter(file, append); 	
		
		fw.write("FileWriter�� �ѱ۷ε� " + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n");
		
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}

