package remocon;

public class RemoteExample3 {

	public static void main(String[] args) {
		// �������̽��� ��ü�� ������ �� ����.
		// RemoteControl rc = new RemoteControl();
		RemoteControl tv = new Television("�Ｚ");
		RemoteControl audio = new Audio();
		
		RemoteControl.control(tv);
		RemoteControl.control(audio);
		RemoteControl.control(new Television("LG"));
	}
	
}
