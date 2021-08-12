package beep;

import java.awt.Toolkit;

public class BeepThreadRun2 {

	public static void main(String[] args) {
		Thread beepThread = new Thread() {
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
				System.out.println("BeepTask: end loop...");
			}
			
				System.out.println("BeepTask: stop...");
			}
		};
		beepThread.start();
		
		
		// �����尡 ���� �Ǳ� ���� ���� ���� �����尡 ����
		System.out.println("main Thread end");
		System.out.println("THE END");
	}

}
