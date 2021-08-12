/*
 * [����ȭ �޼ҵ�]
 * 	- ������ �޼ҵ带 ����ȭ
 * 	- ���� �����尡 ������ �ϸ� ���� ó���ϰ� �ִ� �����尡 ó���� ������
 *    �ٸ� ������� ����Ͽ� ���������� ó��
 * [����ȭ ���]
 * 	- ������ ��ü�� ���� ������ ����ȭ
 * 	- ���� �����尡 ������ ��Ͽ� �����ϸ� ������ ��ü�� ����
 * 	  ���� ���� �����尡 ó���� ������ �ٸ� ������� ���
 */
package threadsynchronized;

public class CalcSync {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	// �޵��� ����ȭ
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2second
		}
		catch(InterruptedException e) {
		}
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	// ����ȭ ���
	public synchronized void setMemoryBlock(int memory) {
		System.out.println("CalcSync::setMemoryBlock");
		synchronized(this) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2second
		}
		catch(InterruptedException e) {
		}
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
	}
}
