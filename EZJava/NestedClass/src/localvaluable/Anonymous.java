/*
 * �޼ҵ忡�� �͸� ���� ��ü�� �޼ҵ��� �Ķ���ͳ� ���ú����� ����ϸ� 
 * final Ư���� ���´�.
 */
package localvaluable;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20;	final Ư���� ����
		//arg2 = 20;	final Ư���� ����
		
		//var1 = 30;	final Ư���� ����
		//var2 = 30;	final Ư���� ����
				

		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}

}
