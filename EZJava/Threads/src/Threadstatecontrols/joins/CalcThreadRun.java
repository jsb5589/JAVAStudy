/*
 * [스레드 우선순위]
 * 디폴트 : NORM_PRIORITY(5)
 * 가장높음 : MAX_PRIORITY(10)
 * 가장낮음 : MIN_PRIORITY(1)
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
