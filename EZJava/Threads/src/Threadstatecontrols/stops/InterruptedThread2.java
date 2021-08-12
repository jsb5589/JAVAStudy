/*
 * InterruptedException을 catch하게 되면
 * Thread.interrupted()로 값을 체크할 수 없다.
 */
package Threadstatecontrols.stops;

public class InterruptedThread2 extends Thread {
	boolean stop = false;
	
	@Override
	public void run() {
		while(stop != true) {
			System.out.println("StopFlagThread: working : interrupted=" + Thread.interrupted());
			if(Thread.interrupted() ) {
				System.out.println("InterruptedThread: interrupted...");
				break;
			}
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted: interrupted exception..");
				stop = true;
			}
			
		}
		
		System.out.println("StopFlagThread: interrupted & stoped...");
	}
}
