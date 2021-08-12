/*
 * File
 *   - ���� ����: �����̸�, ����ũ��, ���ϼӼ�
 *   - ���� ����, ���� ����
 *   - ���丮 ����
 *   - ���丮 ����
 *   - ���丮 ����
 */
package section04.s01_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("D:/Temp/NewDir");
		File file1 = new File("D:/Temp/NewDir/file1.txt");
		File file2 = new File("D:/Temp/NewDir/file2.txt");
		File file3 = new File(new URI("file:///D:/Temp/NewDir/file3.txt"));
		
		if(dir.exists() == false) {  dir.mkdirs();  }
		if(file1.exists() == false) {  file1.createNewFile();  }
		if(file2.exists() == false) {  file2.createNewFile();  }
		if(file3.exists() == false) {  file3.createNewFile();  }

		File temp = new File("D:/Temp/NewDir");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("��¥              �ð�         ����       ũ��    �̸�");
		System.out.println("-------------------------------------------------------------------");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t" + file.getName());
			} else {
				System.out.print("\t<File>\t" + file.length() + "\t" + file.getName());
			}
 			System.out.println();
		}
	}
}
