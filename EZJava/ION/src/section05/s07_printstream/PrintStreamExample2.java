package section05.s07_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamExample2 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Temp/print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�.");
		
		ps.printf("��ǰ�� ����:%d��\n", 123);
		ps.printf("��ǰ�� ����:%6d��\n", 123);
		ps.printf("��ǰ�� ����:%-6d��\n", 123);
		ps.printf("��ǰ�� ����:%06d��\n", 123);
		
		ps.printf("�������� %d�� ���� ����:%10.2f\n", 10, Math.PI*10*10);
		
		ps.printf("%6d | %-10s | %10s\n", 1, "ȫ�浿", "����");
		
		Date now = new Date();
		ps.printf("������ %tY�� %tm�� %td�� �Դϴ�\n", now, now, now);
		ps.printf("������ %1$tY�� %1$tm�� %1$td�� �Դϴ�\n", now);
		ps.printf("���� %1$tH�� %1$tM�� %1$tS�� �Դϴ�\n", now);
		ps.printf("���� %1$tH�� %1$tM�� %2$tS�� �Դϴ�\n", now, now);
		
		ps.flush();
		ps.close();
		fos.close();
	}
}
