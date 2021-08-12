package threadname;

public class ThreadT2 extends Thread {
	public ThreadT2() {
		this.setName("ThreadT2");
	}
	
	@Override
	public void run() {
		int sum = 0;
		for(int cnt=0; cnt <= 10; cnt++) {
			String tname = getName();
			sum += cnt;
			System.out.printf("Thread:[%s][%d][%d]%n", tname, cnt, sum);
		}
	}
}
