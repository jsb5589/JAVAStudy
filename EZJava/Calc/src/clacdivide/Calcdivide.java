package clacdivide;

public class Calcdivide {
	int sum;
	
	public Calcdivide(int sum) {
		this.sum = sum;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int compute(int x) {
		this.sum /= x;
		return this.sum;
	}
}
