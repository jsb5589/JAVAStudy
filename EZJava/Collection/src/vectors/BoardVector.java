package vectors;

import java.util.List;
import java.util.Vector;

public class BoardVector {

	public static void main(String[] args) {
		List<Board> boards = new Vector<Board>();
		
		boards.add(new Board("��������1", "��������1", "������"));
		boards.add(new Board("��������2", "��������2", "�ǹ���"));
		boards.add(new Board("��������3", "��������3", "��ǥ��"));
		boards.add(new Board("��������4", "��������4", "������"));
		
		printBoard(boards);
		
		// �ε��� 2��°�� ��ü�� ����(��������3)
		boards.remove(2);

		printBoard(boards);
	}
	
	static void printBoard(List<Board> boards) {
		System.out.println(">>> printBoard <<<");
		for(Board board : boards) {
			System.out.printf("[%s][%s][%s]\n", 
					board.subject,
					board.content,
					board.writer);
		}
	}
}
