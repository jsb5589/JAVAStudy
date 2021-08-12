/*
 * Thread.interrupted()는 Thread.interrupt()가 호출되면 true가 된다.
 * InterrutedException을 catch하지 않아야 한다.
 */
package Threadstatecontrols.stops;

public class InterruptedThread extends Thread {
	boolean stop = false;
	
	@Override
	public void run() {
		while(stop != true) {
			System.out.println("StopFlagThread: working : interrupted=" + Thread.interrupted());
			if(Thread.interrupted() ) {
				System.out.println("InterruptedThread: interrupted...");
				break;
			}
			/*
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted: interrupted exception..");
				stop = true;
			}
			*/
		}
		
		System.out.println("StopFlagThread: interrupted & stoped...");
	}
}
