package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();

		listLangs.add("1.�ڹ�");
		listLangs.add("2.�ڹٽ�ũ��Ʈ");
		listLangs.add("3.���̽�");
		
		for(int cnt=0; cnt < listLangs.size(); cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
		}
		
		// �ش��ϴ� ��ü�� �����ϴ��� �˻�
		Boolean js = listLangs.contains("2.�ڹٽ�ũ��Ʈ");
		System.out.println("'2.�ڹٽ�ũ��Ʈ'�� �����մϱ�? " + js);

		// �ش��ϴ� ��ü�� �����ϴ��� �˻�
		Boolean py = listLangs.contains("���̽�");
		System.out.println("'���̽�'�� �����մϱ�? " + py);

	}

}
