/*
 * 제너릭은 클래스를 정의할 때 classname<T>로 표기한다.
 * 제너릭은 클래스를 선언할 때 타입을 명시적으로 지정
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
