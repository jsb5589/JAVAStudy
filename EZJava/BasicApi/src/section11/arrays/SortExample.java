/*
 * 정렬(Sort)
 * - 오름차순 : 작은 값에서 큰 값으로 정렬
 * - 내림차순 : 큰 값에서 작은 값으로 정렬
 */
package section11.arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98, 77, 60};
		
		System.out.println("[오름차순(ascendong)]");
<<<<<<< HEAD
	//	Arrays.sort(scores); // 오름차순(ascendong)
=======
		Arrays.sort(scores); // 오름차순(ascendong)
>>>>>>> 5abd71cd966b0e637824785b694efe4cde34de6c
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]=%d\n", i, scores[i]);
		}
		
		System.out.println("[내림차순(descending)]");
<<<<<<< HEAD
		//for(int i=scores.length -1; i>=0; i--) { // 내림차순(descending)
		//	System.out.printf("scores[%d]=%d\n", i, scores[i]);
		//}
=======
		for(int i=scores.length -1; i>=0; i--) { // 내림차순(descending)
			System.out.printf("scores[%d]=%d\n", i, scores[i]);
		}
>>>>>>> 5abd71cd966b0e637824785b694efe4cde34de6c
	}

}
