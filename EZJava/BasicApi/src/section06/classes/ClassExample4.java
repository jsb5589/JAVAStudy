/*
 * Ŭ���� ����(��ŸŬ����)
 * Class
 * - Ŭ������ �̸�, ������ ����, �ʵ� ����, �޼ҵ� ����
 */
package section06.classes;

public class ClassExample4 {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("section06.classes.Car");
			Object obj = clazz.newInstance();
			
			Car car = (Car)obj;
			car.setCarWidth(180);
			System.out.println(car.getCarName());
			System.out.println(obj);
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
	}
}
