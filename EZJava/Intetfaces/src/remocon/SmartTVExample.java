package remocon;

public class SmartTVExample {

	public static void main(String[] args) {
		// �������̽��� ��ü�� ������ �� ����.
		// RemoteControl rc = new RemoteControl();
		RemoteControl smarttv = new SmartTV();
		
		// �������̽� Ȯ��(default method)
		smarttv.setChannel(11);
		
		RemoteControl.control(smarttv);
	}	
}
