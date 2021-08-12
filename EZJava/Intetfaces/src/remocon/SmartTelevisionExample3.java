package remocon;

public class SmartTelevisionExample3 {

	public static void main(String[] args) {
		Searchable stv = new SmartTelevision();
		
		stv.search("ezjava.com");
		
		// Searchable에 turnOn, set... turnOff가 없어 에러남
		//stv.turnOn();
		//stv.setVolume(15);
		//stv.turnOff();

	}

}
