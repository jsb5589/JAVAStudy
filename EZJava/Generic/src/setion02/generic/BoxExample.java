package setion02.generic;

public class BoxExample {

	public static void main(String[] args) {
		// Box<String> box = new Box<String>():
		Box<Integer> box = new Box<Integer>();
		box.set(99);
		
		// 캐스팅을 할 필요가 없다.
		// String str = (String)box.get()
		Integer i1 = box.get();
		int i2 = box.get();
		System.out.println(i1);
		System.out.println(i2);
	}

}
