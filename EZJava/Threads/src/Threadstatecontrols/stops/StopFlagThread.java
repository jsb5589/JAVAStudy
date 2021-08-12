package Threadstatecontrols.stops;

public class StopFlagThread extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(stop != true) {
			System.out.println("StopFlagThread: working...");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
		System.out.println("StopFlagThread: stoped...");
	}
}
