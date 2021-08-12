/*
 * ���ʸ��� Ŭ������ Ÿ���� ��������� �����Ͽ� Ÿ���� �����Ѵ�.

 * ���ʸ��� Ŭ���� ������ �� Classname<T>�� ǥ���Ѵ�.
 *   - T�� ����Ÿ��
 *   - <T> ������ Ÿ���� �� �� �ִٴ� �ǹ�
 *   - T = (String | Class | Object | ...)
 *   
 * ���ʸ� ����
 *   class Classname<Type> {
 *   }  
 *   
 * ���ʸ� ����  
 *   Classname<Type> = new Classname<Type>
 */

package section02.generic;

public class Box<T> {
	private T name;
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get() {
		return this.name;
	}
}
