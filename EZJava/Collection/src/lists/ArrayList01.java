/*
 * ArrayList() �ʱ� �뷮 : DEFAULT_CAPACITY = 10;
 */
package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List<String> listLangs = new ArrayList<String>();

		listLangs.add("1.�ڹ�");
		listLangs.add("2.�ڹٽ�ũ��Ʈ");
		listLangs.add("3.���̽�");
		
		for(String lang : listLangs) {
			System.out.println(lang);
		}
	}

}
