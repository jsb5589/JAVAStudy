/*
 * ���ʸ��� Ŭ������ ������ �� classname<T>�� ǥ���Ѵ�.
 * ���ʸ��� Ŭ������ ������ �� Ÿ���� ��������� ����
 */
package setion02.generic;

public class Box<T> {
	private T name;
	
	public void set(T name) {	// T = (int | flat | double | String | Class | ...)
		this.name = name;	// private String name;
	}
	
	public T get() {
		return this.name;
	}

}
