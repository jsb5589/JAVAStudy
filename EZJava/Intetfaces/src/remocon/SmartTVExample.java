package remocon;

public class SmartTVExample {

	public static void main(String[] args) {
		// 인터페이스는 객체로 생성할 수 없다.
		// RemoteControl rc = new RemoteControl();
		RemoteControl smarttv = new SmartTV();
		
		// 인터페이스 확장(default method)
		smarttv.setChannel(11);
		
		RemoteControl.control(smarttv);
	}	
}
