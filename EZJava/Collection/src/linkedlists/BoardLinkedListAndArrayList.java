package linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BoardLinkedListAndArrayList {

	public static void main(String[] args) {
		List<Board> boardsLinkedList = new LinkedList<Board>();
		List<Board> boardsArrayList = new ArrayList<Board>();

		// [ArrayList]
		long startTime2 = System.nanoTime();
		
		for(int cnt=0; cnt < 100000; cnt++) {
			String subject = String.format("�������� %d", cnt);
			String content = String.format("�������� %d", cnt);
			boardsArrayList.add(0, new Board(subject, content, "������"));
		}
		
		long endTime2 = System.nanoTime();
		printTime("ArrayList", startTime2, endTime2);
		
		// [LinkedList]
		long startTime = System.nanoTime(); // 10�� 9�º��� 1��(10����� 1��)
		
		for(int cnt=0; cnt < 100000; cnt++) {
			String subject = String.format("�������� %d", cnt);
			String content = String.format("�������� %d", cnt);
			boardsLinkedList.add(0, new Board(subject, content, "������"));
		}
		
		long endTime = System.nanoTime();
		printTime("LinkedList", startTime, endTime);

		
	}
	
	static void printTime(String title, long startTime, long endTime) {
		// double xsec = (endTime - startTime) / 1000000000.0;
		double xsec = (endTime - startTime) / 1.0e9; // ns(10����� 1��)
		System.out.printf("[%10s] ó���ð�(%d)ns, (%f)second\n", title, (endTime - startTime), xsec);
	}
	
	
	static void printBoard(List<Board> boards) {
		System.out.println(">>> printLinkedList <<<");
		for(Board board : boards) {
			System.out.printf("[%s][%s][%s]\n", 
					board.subject,
					board.content,
					board.writer);
		}
	}
}
