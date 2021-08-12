package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();

		listLangs.add("1.�ڹ�");
		listLangs.add("2.�ڹٽ�ũ��Ʈ");
		listLangs.add("3.���̽�");
		
		for(int cnt=0; cnt < listLangs.size(); cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
		}
		
		// �ε��� 1��°�� �ִ� ������ �ٲ�
		listLangs.set(1, "JavaScript");
		
		// �ε��� 2��°�� �ִ� ��ü�� ����
		listLangs.remove(2);
		
		// ����Ʈ���� �ش��ϴ� ��ü�� ã�Ƽ� ����
		listLangs.remove("1.�ڹ�");
		
		System.out.println("<ArrayList>");
		System.out.println("size : " + listLangs.size());
		
		for(int cnt=0; cnt < listLangs.size(); cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
		}
		

		System.out.println("<����Ʈ�� ��� ������ ����>");
		listLangs.clear();
		
		System.out.println("size : " + listLangs.size());
		
		for(int cnt=0; cnt < listLangs.size(); cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
		}

	}

}
