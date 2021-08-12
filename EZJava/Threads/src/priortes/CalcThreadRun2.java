/*
 * [������ �켱����]
 * ����Ʈ : NORM_PRIORITY(5)
 * ������� : MAX_PRIORITY(10)
 * ���峷�� : MIN_PRIORITY(1)
 */
package priortes;

public class CalcThreadRun2 {

	public static void main(String[] args) {
		for(int cnt=0; cnt<=10; cnt++) {
			Thread thread = new CalcThread("thread" + cnt);
			
			if(cnt % 2 == 1) {
				thread.setPriority(7);
			}
			else {
				thread.setPriority(9);
			}
			
			System.out.printf("[%s] priority(%d)\n", thread.getName(), thread.getPriority());
			
			thread.start();
		}

	}

}
