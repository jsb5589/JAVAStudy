package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();

		listLangs.add("1.�ڹ�");
		listLangs.add("2.�ڹٽ�ũ��Ʈ");
		listLangs.add("3.���̽�");
		
		
		System.out.println("<ArrayList>");
		
		for(String lang : listLangs) {
			System.out.println(lang);
		}
	}

}
