/*
 * Runnable �������̽��� �͸�����ü�� ���ٽ����� �����Ͽ�
 * Thread�� �����ڷ� �����Ͽ� �����带 ó��
 */
package beep;

import java.awt.Toolkit;

public class BeepTaskRun3 {

	public static void main(String[] args) {
		Thread beepThread = new Thread(() -> {
			
				System.out.println("BeepTask: start...");
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					System.out.printf("BeepTask: beep(%d)!!!\n", i);
					try {
						Thread.sleep(500); // millisecond(1000���� 1��)
					}
					catch(Exception e) {
					}
					System.out.println("BeepTask: end...");
				}
		});
		
		// ������ ����(��׶���� ó��)
		beepThread.start();
		
		// �����尡 ���� �Ǳ� ���� ���� ���� ������ ����
		System.out.println("main thread end");
	}

}
