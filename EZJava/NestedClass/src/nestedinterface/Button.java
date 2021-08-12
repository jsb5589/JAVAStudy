/*
 * [��ø �������̽�]
 * - Ŭ���� �ȿ� �������̽��� ����
 * - Ŭ������ ���ӵ� �������̽��� ����
 */
package nestedinterface;

public class Button {
	interface OnClickListener {
		void onClick();
	}

	OnClickListener listener;
	OnTouchListener touchListener;
	
	Button() {
		System.out.println("Button Class: Constructor...");
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void setOnTouchListener(OnTouchListener listener) {
		touchListener = listener;
	}
	
	void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
		
		if(this.touchListener != null) {
			this.touchListener.onTouch("�ӹ� �Ϸ�!");
		}
	}
	
}
