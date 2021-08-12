package Threadstatecontrols.stops;

public class InterruptRun {

	public static void main(String[] args) {
		Thread thread = new InterruptedThread();
		thread.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		
		thread.interrupt();

	}

}
