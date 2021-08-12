package calcplus;

public class Calcplusrun {

	public static void main(String[] args) {
		Calcplus calcplus = new Calcplus(0);
		int sum = calcplus.compute(10);
		System.out.println(calcplus.sum);
		System.out.println("calcplus=" + calcplus.getSum());

	}

}
