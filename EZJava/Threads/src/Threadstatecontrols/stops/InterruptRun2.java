package Threadstatecontrols.stops;

public class InterruptRun2 {

	public static void main(String[] args) {
		Thread thread = new InterruptedThread2();
		thread.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		
		thread.interrupt();

	}

}
