/*
 * 메소드에서 익명 구현 객체가 메소드의 파라미터나 로컬변수를 사용하면 
 * final 특성을 갖는다.
 */
package localvaluable;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20;	final 특성을 갖춤
		//arg2 = 20;	final 특성을 갖춤
		
		//var1 = 30;	final 특성을 갖춤
		//var2 = 30;	final 특성을 갖춤
				

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
