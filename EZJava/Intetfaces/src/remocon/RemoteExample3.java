package remocon;

public class RemoteExample3 {

	public static void main(String[] args) {
		// 인터페이스는 객체로 생성할 수 없다.
		// RemoteControl rc = new RemoteControl();
		RemoteControl tv = new Television("삼성");
		RemoteControl audio = new Audio();
		
		RemoteControl.control(tv);
		RemoteControl.control(audio);
		RemoteControl.control(new Television("LG"));
	}
	
}
