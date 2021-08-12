package remocon;

public interface RemoteControl {
	//���
	public static final int RC_VALUME = 5;
	public int MAX_VALUME = 10;
	public int MIN_VALUME = 0;

	//�ڵ����� �߻� �޼ҵ�(abstract method)�� �ǹǷ� ������ ���� �� ����.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	/*
	 * ���� �߰�(Smart TV��)
	 * 1. ����Ʈ �޼ҵ带 ���ؼ� �������̽��� Ȯ��
	 * 2. ���� ȣȯ���� ����
	*/
	default public void setChannel(int channel) {
		System.out.println("ä�κ���");
	}
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
	}
	
	static void control(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
