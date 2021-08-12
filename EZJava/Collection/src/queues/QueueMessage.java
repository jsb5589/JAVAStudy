/*
 * Queue(ť)
 * 	���Լ���: ���� ���� ���� ���� ����
 * 	- FIFO(First In First Out)
 * 	- 
 */
package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessage {
	
	public static void main(String[] args) {
		Queue<Message> messages = new LinkedList<Message>();
		
		// ť�� �޽����� ����
		messages.offer(new Message("�غ�", "������"));
		messages.offer(new Message("�۾�", "����ȣ"));
		messages.offer(new Message("�̵�", "����"));
		
		pollMessages(messages);
		pollMessages(messages); // ť�� �� ������� �ڷᰡ ����
	}
	
	// Queue.poll() : ť���� �޽����� ������ ����
		static void pollMessages(Queue<Message> messages) {
			System.out.println("[pollMessages] size=" + messages.size());
		while(messages.isEmpty() != true) {
			Message message = messages.poll();
			switch(message.command) {
			case "�غ�":
				System.out.printf("[�غ��ϼ���] command=%s, to=%s%n", message.command, message.to);
				break;
			case "�۾�":
				System.out.printf("[�۾��ϼ���] command=%s, to=%s%n", message.command, message.to);
				break;
			case "�̵�":
				System.out.printf("[�̵��ϼ���] command=%s, to=%s%n", message.command, message.to);
				break;
			}
			
		}
	}
}

