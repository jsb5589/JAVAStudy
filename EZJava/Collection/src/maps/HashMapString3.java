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

public class HashMapString3 {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		maps.put("�ڹ�", 20);
		maps.put("���̽�", 15);
		maps.put("�ڹٽ�ũ��Ʈ", 25);
		
		printMap(maps);
	}
	
	static void printMap(Map<String, Integer> maps) {
		System.out.println("maps.size : " + maps.size());
		
		Set<Map.Entry<String, Integer>> entrySet = maps.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.printf("key(%s), value(%d)%n", key, value);
		}
	}

}
