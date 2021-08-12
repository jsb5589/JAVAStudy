package remocon;

public class Audio implements RemoteControl {

	public int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù");
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
		System.out.println("ÇöÀç Audio º¼·ý:" + this.volume);
	}

}
