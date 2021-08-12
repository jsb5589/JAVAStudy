package remocon;

public class SmartTelevisionExample2 {

	public static void main(String[] args) {
		RemoteControl stv = new SmartTelevision();
		
		// RemoteControl에 search가 없어 에러가남
		//stv.search("ezjava.com");
		stv.turnOn();
		stv.setVolume(15);
		stv.turnOff();

	}

}
