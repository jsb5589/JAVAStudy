package remocon;

public class SmartTelevision implements RemoteControl, Searchable {
	
	@Override
	public void search(String url) {
		System.out.printf("[SmartTelevision] search(%s)\n", url);
	}

	@Override
	public void turnOn() {
		System.out.println("[SmartTelevision] turnOn");

	}

	@Override
	public void turnOff() {
		System.out.println("[SmartTelevision] turnOff");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("[SmartTelevision] setvolume=" + volume);
	}

}
