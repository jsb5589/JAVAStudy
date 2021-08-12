package clacminus;

public class Calcminus {
	int sum;
	
	public Calcminus(int sum) {
		this.sum = sum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int compute(int x) {
		this.sum -= x;
		return this.sum;
	}
}
