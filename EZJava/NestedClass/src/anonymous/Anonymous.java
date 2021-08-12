package anonymous;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("���");
		}
		
		@Override
		void wake() {
			System.out.print("> 6�ÿ� ��� : ");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å");
			}
			
			@Override
			void wake() {
				System.out.print("> 7�ÿ� ��� : ");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}

}
