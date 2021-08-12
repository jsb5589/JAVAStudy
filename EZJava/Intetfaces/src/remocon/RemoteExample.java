package remocon;

public class RemoteExample {

	public static void main(String[] args) {
		System.out.println("RemoteControl.MAX_VALUME:" + RemoteControl.MAX_VALUME);
		System.out.println("RemoteControl.MIN_VALUME:" + RemoteControl.MIN_VALUME);
		System.out.println("RemoteControl.RC_VALUME:" + RemoteControl.RC_VALUME);

		RemoteControl.changeBattery();
	}

}
