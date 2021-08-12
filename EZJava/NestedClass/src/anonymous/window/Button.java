/*
 * [중첩인터페이스]
 * -클래스 안에 인터페이스를 정의
 * -클래스에 종속된 인터페이스로 한정
 */
package anonymous.window;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}

}
