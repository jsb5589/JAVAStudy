/*
 * Runnable �������̽��� �͸�����ü�� �����Ͽ�
 * Thread�� �����ڷ� �����Ͽ� �����带 ó��
 */
package beep;

import java.awt.Toolkit;

public class BeepTaskRun2 {

	public static void main(String[] args) {
		Thread beepThread = new Thread(new Runnable() {
			@Override
			public void run() {
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
			}
		});
		
		// ������ ����(��׶���� ó��)
		beepThread.start();
		
		// �����尡 ���� �Ǳ� ���� ���� ���� ������ ����
		System.out.println("main thread end");
	}

}
