package exercises.exercise02;

public class TigerExample {

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.breathe();
		
		// 객체를 Cat으로 만들어 부모에 대입을 하고
		// 다시 Cat으로 캐스팅하여 사용하는 것은 문제가 없다.
		Cat cat = (Cat)animal;
		cat.breathe();
		
		// 부모객체를 자식 객체로 캐스팅을 하면 실행 오류가 발생한다.
		// 예외발생 (java.lang.ClssCastExecption)
		Tiger tiger = (Tiger)animal;
		tiger.breathe();
	}
		
	
}
