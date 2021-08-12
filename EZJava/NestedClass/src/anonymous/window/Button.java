/*
 * [��ø�������̽�]
 * -Ŭ���� �ȿ� �������̽��� ����
 * -Ŭ������ ���ӵ� �������̽��� ����
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
