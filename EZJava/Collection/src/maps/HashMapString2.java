/*
 * [map]
 * Ű�� ������ ����
 * ��ųʸ�(dictionary)
 * Ű�� �ߺ��� ������� ����
 * ���� �ߺ��� ���
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapString2 {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		maps.put("�ڹ�", 20);
		maps.put("���̽�", 15);
		maps.put("�ڹٽ�ũ��Ʈ", 25);
		
		printMap(maps);
		
		// ���ο� ������ �ٲ�
		maps.put("�ڹ�", 23);
		
		// Ű�� ����
		System.out.println("[����]");
		maps.remove("���̽�");
		printMap(maps);
		
		// ��� �����͸� ����
		System.out.println("[��ü����]");
		maps.clear();
		printMap(maps);
	}
	
	static void printMap(Map<String, Integer> maps) {
		System.out.println("maps.size : " + maps.size());
		
		Set<String> keySet = maps.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = maps.get(key);
			System.out.printf("key(%s), value(%d)%n", key, value);
		}
	}

}
