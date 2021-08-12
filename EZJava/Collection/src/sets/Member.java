/*
 * ����� ���� Ŭ������ set���� ����� ��
 * �����Ͱ� ������ �ߺ����� �ʵ��� ó���ϱ� ���ؼ���
 * hashCode(), equals()�� ������ �ؾ� �Ѵ�.
 */
package sets;

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() {
		System.out.printf("[%s][%d][%d]\n", this.name, this.name.hashCode(), this.age);
		return this.name.hashCode() + this.age;
	}
	
	/*
	 * new�� ���ؼ� ������ ��ü�̹Ƿ� �ٸ��� �ν�
	public boolean equals(Object obj) {
		System.out.println("equals: "+ (this == obj));
		return this == obj;
	}
	*/
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age == age);
		}
		else {
			return false;
		}
	}
	
}