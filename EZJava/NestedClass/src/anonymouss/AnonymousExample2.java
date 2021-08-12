package anonymouss;

public class AnonymousExample2 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//anony.field.wake();
		
		//anony.method1();
		
		Person ps = new Person() {
			void run() {
				System.out.println("달린다.");
			}
			@Override
			void wake() {
				System.out.println("5시에 일어납니다.");
				run();
			}
		};	
		
		anony.method2(ps);  //변수선언 정의 후 대입
		
		anony.method2(		//직접 대입
			new Person() {
				void run() {
				System.out.println("달린다.");
			}
			@Override
			void wake() {
				System.out.println("5시에 일어납니다.");
				run();
				}
			}
		);
	}
}
