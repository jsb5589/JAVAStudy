/*
 * ����(Sort)
 * - �������� : ���� ������ ū ������ ����
 * - �������� : ū ������ ���� ������ ����
 */
package section11.arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98, 77, 60};
		
		System.out.println("[��������(ascendong)]");
<<<<<<< HEAD
	//	Arrays.sort(scores); // ��������(ascendong)
=======
		Arrays.sort(scores); // ��������(ascendong)
>>>>>>> 5abd71cd966b0e637824785b694efe4cde34de6c
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]=%d\n", i, scores[i]);
		}
		
		System.out.println("[��������(descending)]");
<<<<<<< HEAD
		//for(int i=scores.length -1; i>=0; i--) { // ��������(descending)
		//	System.out.printf("scores[%d]=%d\n", i, scores[i]);
		//}
=======
		for(int i=scores.length -1; i>=0; i--) { // ��������(descending)
			System.out.printf("scores[%d]=%d\n", i, scores[i]);
		}
>>>>>>> 5abd71cd966b0e637824785b694efe4cde34de6c
	}

}
