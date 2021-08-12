package remocon;

public class SmartTelevisionExample4 {

	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		
		Searchable searchable = (Searchable)stv;
		searchable.search("ezjava.com");
		
		RemoteControl rc = (RemoteControl)stv;
		stv.turnOn();
		stv.setVolume(15);
		stv.turnOff();

	}

}
