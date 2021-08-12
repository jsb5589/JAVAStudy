/*
 * [set]
 * 1. �ߺ��ؼ� ��� ���� ����
 * 2. ������ ������
 */
package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMember2 {

	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		
		members.add(new Member("�ڹ�", 20));
		members.add(new Member("�ڹ�", 20));
		
		
		printMembers(members);
		
	}

	static void printMembers(Set<Member> members) {
		System.out.println("printMembers.size : " + members.size());
		
		Iterator<Member> it = members.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			System.out.printf("member: name(%s), age(%d) %n", member.name, member.age);
		}
		
	}
	
}