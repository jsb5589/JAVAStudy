/*
 * �͸� ���� ��ü
 * 1. ��ȸ�� ��ü ����
 */
package remocon;

public class AnonymousExample {

	public static void main(String[] args) {
		RemoteControl radio = new RemoteControl() {
			public void turnOn() {
				System.out.println("Radio On");
			}
			
			public void turnOff() {
				System.out.println("Radio Off");
			}
		
			public void setVolume(int volume) {
				System.out.println("Radio Volume");
				
			}
		}; // �ݵ�� �����ݷ�(;)

		RemoteControl.control(radio);
		//RemoteControl.control(new Radio());
	}

}
