package remocon;

public class Television implements RemoteControl {
	
	private int volume;
	private String model;
	Television(String model){
		this.model = model;
	}

	@Override
	public void turnOn() {
		System.out.printf("[%s]TV �ѱ�\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s]TV ����\n", this.model);
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUME) {
			this.volume = RemoteControl.MAX_VALUME;
		}
		else if(volume<RemoteControl.MIN_VALUME) {
			this.volume = RemoteControl.MIN_VALUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� TV ����:" + this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
		if(mute) {
			System.out.printf("[%s] �������\n", this.model);
		}
		else {
			System.out.printf("[%s] ��������\n", this.model);
		}
	}
}
