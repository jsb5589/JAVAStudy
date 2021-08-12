/*
 * 클래스 정보(메타클래스)
 * Class
 * - 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보
 */
package section06.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample3 {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("section06.classes.Car");
			
			System.out.println("class name: " + clazz.getName());
			
			System.out.println("[생성자 정보]");
			Constructor[] constructors = clazz.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				Class[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
			}
			
			}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}
	}
	
	static void printParameters(Class[] prarmeters) {
		for(int i = 0; i < prarmeters.length; i++) {
		System.out.println("paramter: " + prarmeters[i].getName());
	}
}
}
