package remocon;

public class RemoteExample2 {

	public static void main(String[] args) {
		// �������̽��� ��ü�� ������ �� ����.
		// RemoteControl rc = new RemoteControl();
		RemoteControl tv = new Television("�Ｚ");
		RemoteControl audio = new Audio();
		
		control(tv);
		control(audio);
	}
	
	static void control(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
