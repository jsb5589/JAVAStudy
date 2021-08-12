package runtimeexceptions;

public class DvideExceptionExample2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = (y != 0) ? x / y : 0; // ArithmeticExcpetion
		
		System.out.println("z=" + z);

	}

}
