package beep;

public class BeepThreadRun {

	public static void main(String[] args) {
		Thread beepThread = new BeepThread();
		beepThread.start();
		
		// �����尡 ���� �Ǳ� ���� ���� ���� �����尡 ����
		System.out.println("main Thread end");
		System.out.println("THE END");
	}

}
