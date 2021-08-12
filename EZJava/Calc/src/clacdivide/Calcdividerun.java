package clacdivide;

public class Calcdividerun {

	public static void main(String[] args) {
		Calcdivide calcdivide = new Calcdivide(1000);
		int sum = calcdivide.compute(50);
		System.out.println(calcdivide.sum);
		System.out.println("calcdivide=" + calcdivide.getSum());

	}

}
