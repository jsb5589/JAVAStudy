package remocon;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		stv.search("ezjava.com");
		stv.turnOn();
		stv.setVolume(15);
		stv.turnOff();

	}

}
