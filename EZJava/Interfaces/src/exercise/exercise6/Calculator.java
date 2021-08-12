package exercise.exercise6;

public class Calculator implements Calc {
	private double total = 0.0;
	
	Calculator(){}
	Calculator(double value){
		this.total = value;
	}

	@Override
	public double plus(double value) {
		this.total += value;
		return this.total;
	}

	@Override
	public double minus(double value) {
		this.total -= value;
		return this.total;
	}

	@Override
	public double multiple(double value) {
		this.total *= value;
		return this.total;
	}

	@Override
	public double divide(double value) {
		this.total /= value;
		return this.total;
	}

	@Override
	public double total() {
		System.out.printf("Calc:total(%f)\n", this.total);
		return this.total;
	}

}
