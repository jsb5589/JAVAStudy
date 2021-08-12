/*
 * [������ �켱����]
 * ����Ʈ : NORM_PRIORITY(5)
 * ������� : MAX_PRIORITY(10)
 * ���峷�� : MIN_PRIORITY(1)
 */
package Threadstatecontrols.joins;

public class CalcThreadRun {

	public static void main(String[] args) {
		CalcThread thread = new CalcThread("tot");
		thread.start();
		
		try {
			thread.join();
		}
		catch(InterruptedException e) {
			
		}
		
		System.out.printf("Thread: [%s] tot[%.0f]%n", thread.getName(), thread.total());
	}

}
