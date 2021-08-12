/*
 * Thread.interrupted()�� Thread.interrupt()�� ȣ��Ǹ� true�� �ȴ�.
 * InterrutedException�� catch���� �ʾƾ� �Ѵ�.
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
