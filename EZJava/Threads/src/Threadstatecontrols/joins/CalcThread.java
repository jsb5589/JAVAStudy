package Threadstatecontrols.joins;

public class CalcThread extends Thread {
	double tot;
	
	public CalcThread(String tname) {
		setName(tname);
	}
	
	@Override
	public void run() {
		for(int cnt = 0; cnt <= 1000; cnt++) {
			tot += (double)cnt;
		}
	}
	public double total() {
		return this.tot;
	}

}
