/*
 * [������ �켱����]
 * ����Ʈ : NORM_PRIORITY(5)
 * ������� : MAX_PRIORITY(10)
 * ���峷�� : MIN_PRIORITY(1)
 */
package priortes;

public class CalcThreadRun {

	public static void main(String[] args) {
		for(int cnt=0; cnt<=10; cnt++) {
			Thread thread = new CalcThread("thread" + cnt);
			
			System.out.printf("[%s] default priority(%d)\n", thread.getName(), thread.getPriority());
			
			if(cnt == 10) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			
			System.out.printf("[%s] priority(%d)\n", thread.getName(), thread.getPriority());
			
			thread.start();
		}

	}

}
