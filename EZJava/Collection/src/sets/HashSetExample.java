/*
 * [set]
 * 1. �ߺ��ؼ� ��� ���� ����
 * 2. ������ ������
 */
package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		
		setString.add("�ڹ�");
		setString.add("�ڹٽ�ũ��Ʈ");
		setString.add("���̽�");
		setString.add("�ڹ�"); // �ߺ��ؼ� ��� ���� ����
		
		int size = setString.size();
		System.out.println("setString.size : " + size);
		
		for(String str : setString) {
			System.out.println(str);
		}

	}

}
