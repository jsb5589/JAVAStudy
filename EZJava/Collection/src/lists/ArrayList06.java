package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();

		listLangs.add("1.�ڹ�");
		listLangs.add("2.�ڹٽ�ũ��Ʈ");
		listLangs.add("3.���̽�");
		
		Iterator<String> it = listLangs.iterator();
		while(it.hasNext()) {
			String lang = it.next();
			System.out.printf("[%s]\n", lang);
		}
	}
}

