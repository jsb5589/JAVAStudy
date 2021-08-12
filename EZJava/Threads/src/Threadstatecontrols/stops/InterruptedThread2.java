/*
 * InterruptedException�� catch�ϰ� �Ǹ�
 * Thread.interrupted()�� ���� üũ�� �� ����.
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
