package remocon;

public class SmartTV implements RemoteControl {
	private String model = "스마트TV";
	private int channel;
	private int volume;

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.printf("채널변경:[%s] channel(%d)\n", this.model, this.channel);
		
	}
	
	@Override
	public void turnOn() {
		System.out.printf("[%s] SmartTV 켜기\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] SmartTV 끄기\n", this.model);
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
		System.out.println("현재 TV 볼륨:" + this.volume);
	}


	

}
